package com.tencent.atlas.model;

import com.tencent.atlas.constant.TagConstant;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.ExpressionGroup;
import com.tencent.atlas.feature.com.google.common.base.Preconditions;
import com.tencent.atlas.feature.com.google.common.collect.Maps;
import com.tencent.atlas.feature.org.apache.commons.lang3.ClassUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ReflectionUtils;

/**
 * the base tree node implements
 *
 * @param <T> the type
 */
public abstract class TreeNode<T extends TreeNode> {

    private static final Logger LOGGER = LoggerFactory.getLogger(TreeNode.class);

    /**
     * the class
     */
    private Class<?> klass;

    /**
     * the constructor
     *
     * @param klass
     */
    public TreeNode(Class<?> klass) {
        this.klass = klass;
    }

    /**
     * the children instance
     *
     * @return the children
     */
    public abstract List<T> children();

    /**
     * Runs the given function on this node and then recursively on [[children]].
     *
     * @param f the function to be applied to each node in the tree.
     */
    @SuppressWarnings("uncheckd")
    public void foreach(Consumer<T> f) {
        f.accept((T) this);
        children().forEach(inner -> inner.foreach(f));
    }

    /**
     * Runs the given function recursively on [[children]] then on this node.
     *
     * @param f the function to be applied to each node in the tree.
     */
    @SuppressWarnings("uncheckd")
    public void foreachUp(Consumer<T> f) {
        children().forEach(inner -> inner.foreach(f));
        f.accept((T) this);
    }

    /**
     * Returns a copy of this node where `rule` has been recursively applied to it and all of its children (pre-order).
     * When `rule` does not apply to a given node it is left unchanged.
     *
     * @param rule the function used to transform this nodes children
     */
    @SuppressWarnings("unchecked")
    public T transformDown(final Function<T, T> rule) {
        try {
            TreeNode afterRule = rule.apply((T) this);
            return (T) afterRule.mapChildren(child -> ((T) child).transformDown(rule));
        } catch (TreeNodeException e) {
            LOGGER.error("transform down failed,pls check!", e);
            return null;
        }
    }

    /**
     * Returns a copy of this node where `rule` has been recursively applied first to all of its children and then
     * itself (post-order). When `rule` does not apply to a given node, it is left unchanged.
     *
     * @param rule the function use to transform this nodes children
     */
    @SuppressWarnings("unchecked")
    public T transformUp(final Function<T, T> rule) {
        try {
            T afterRuleByChildren = mapChildren(child -> ((T) child).transformUp(rule));
            return rule.apply(afterRuleByChildren);
        } catch (TreeNodeException e) {
            LOGGER.error("transform up failed,pls check!", e);
            return null;
        }
    }

    /**
     * test this instance is/not a child field
     *
     * @param instance instance
     * @return
     */
    public boolean contains(Object instance) {
        for (T child : children()) {
            if (Objects.equals(instance, child)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    protected <R extends TreeNode> T mapChildren(Function<T, R> f) throws TreeNodeException {
        List<Field> fields =
                Arrays.stream(this.getClass().getDeclaredFields())
                        .filter(inner -> !inner.isSynthetic() && !Modifier
                                .isStatic(inner.getModifiers()) && !Modifier
                                .isFinal(inner.getModifiers())) // filter synthetic field and static and final field
                        .collect(Collectors.toList());
        Object[] newArgs = new Object[fields.size()];
        for (int i = 0; i < fields.size(); i++) {
            ReflectionUtils.makeAccessible(fields.get(i));
            Object target = ReflectionUtils.getField(fields.get(i), this);
            if (target == null) {
                continue;
            } else if (target instanceof ExpressionGroup) {
                newArgs[i] = new ExpressionGroup(((ExpressionGroup) target).children()
                        .stream().map(inner -> (Expression<?>) this.mapChild(f, inner)).collect(Collectors.toList()));
            } else if (target instanceof List) {
                newArgs[i] =
                        ((List<?>) target)
                                .stream().map(inner -> this.mapChild(f, inner)).collect(Collectors.toList());
            } else if (target instanceof Set) {
                newArgs[i] =
                        ((Set<?>) target)
                                .stream().map(inner -> this.mapChild(f, inner)).collect(Collectors.toSet());
            } else if (target instanceof Map) {
                Map newly = Maps.newHashMap();
                for (Map.Entry<?, ?> entry : ((Map<?, ?>) target).entrySet()) {
                    newly.put(entry.getKey(), mapChild(f, entry.getValue()));
                }
                newArgs[i] = newly;
            } else {
                newArgs[i] = this.mapChild(f, target);
            }
        }
        return makeCopy(Arrays.stream(newArgs).filter(Objects::nonNull).toArray());
    }

    private <R extends TreeNode> Object mapChild(Function<T, R> f, Object target) {
        if (target instanceof TreeNode && contains(target)) {
            return f.apply((T) target);
        } else {
            return target;
        }
    }

    /**
     * Creates a copy of this type of tree node after a transformation. Must be overridden by child classes that have
     * constructor arguments that are not present in the productIterator.
     *
     * @param newArgs the new product arguments.
     */
    @SuppressWarnings("unchecked")
    protected T makeCopy(Object[] newArgs) throws TreeNodeException {
        // Skip no-arg constructors that are just there for kryo.
        Constructor<?>[] ctors = getClass().getConstructors();
        Constructor<?> candidate = null;
        Class<?>[] argsKlazz = new Class[newArgs.length];
        for (int i = 0; i < newArgs.length; i++) {
            argsKlazz[i] = newArgs[i] == null ? java.lang.Object.class : newArgs[i].getClass();
        }
        for (Constructor<?> ctor : ctors) {
            if (ctor.getParameterCount() == newArgs.length
                    && ClassUtils.isAssignable(argsKlazz, ctor.getParameterTypes())) {
                candidate = ctor;
                break;
            }
        }
        Preconditions.checkArgument(candidate != null, "No valid constructor for %s", nodeName());
        try {
            return (T) candidate.newInstance(newArgs);
        } catch (InvocationTargetException | IllegalAccessException | InstantiationException | IllegalArgumentException e) {
            throw new TreeNodeException(
                    this, "Failed to copy node, Is otherCopyArgs specified correctly for %s", e);
        }
    }

    public String nodeName() {
        return this.getClass().getSimpleName();
    }

    public String treeString() {
        return generateTree(0, 0);
    }

    /**
     * generate tree string
     *
     * @param level current tree level
     * @param index current index
     * @return
     */
    protected String generateTree(int level, int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append('\t');
        }
        if (index == 0) {
            sb.append(TagConstant.LEVEL_TAG);
        } else {
            sb.append(TagConstant.STEP_TAG);
        }
        sb.append(nodeName());
        sb.append("\n");
        for (int i = 0; i < children().size(); i++) {
            sb.append(children().get(i).generateTree(level + 1, i));
        }
        return sb.toString();
    }

    static class TreeNodeException extends Exception {

        /**
         * with message
         *
         * @param node node instance
         * @param msg message
         */
        public TreeNodeException(TreeNode node, String msg) {
            super(String.format("tree: %s, message: %s", node.treeString(), msg));
        }

        /**
         * with message and throwable
         *
         * @param node the node
         * @param msg the message
         * @param t the exception
         */
        public TreeNodeException(TreeNode node, String msg, Throwable t) {
            super(String.format("tree: %s, message: %s", node.treeString(), msg), t);
        }
    }
}
