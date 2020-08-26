package org.learn2pro.atlas.model;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import org.learn2pro.atlas.constant.TagConstant;
import java.lang.reflect.Modifier;
import org.apache.commons.lang3.ClassUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

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
   * Returns a copy of this node where `rule` has been recursively applied to it and all of its
   * children (pre-order). When `rule` does not apply to a given node it is left unchanged.
   *
   * @param rule the function used to transform this nodes children
   */
  @SuppressWarnings("unchecked")
  public T transformDown(Function<T, T> rule) {
    try {
      TreeNode afterRule = rule.apply((T) this);
      return (T) afterRule.mapChildren(rule);
    } catch (TreeNodeException e) {
      LOGGER.error("transform down failed,pls check!", e);
      return null;
    }
  }

  /**
   * Returns a copy of this node where `rule` has been recursively applied first to all of its
   * children and then itself (post-order). When `rule` does not apply to a given node, it is left
   * unchanged.
   *
   * @param rule the function use to transform this nodes children
   */
  @SuppressWarnings("unchecked")
  public T transformUp(Function<T, T> rule) {
    try {
      T afterRuleByChildren = mapChildren(rule);
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
                .isStatic(inner.getModifiers())) // filter synthetic field
            .collect(Collectors.toList());
    Object[] newArgs = new Object[fields.size()];
    for (int i = 0; i < fields.size(); i++) {
      ReflectionUtils.makeAccessible(fields.get(i));
      Object target = ReflectionUtils.getField(fields.get(i), this);
      if (target == null) {
        newArgs[i] = target;
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
      }
    }
    return makeCopy(newArgs);
  }

  private <R extends TreeNode> Object mapChild(Function<T, R> f, Object target) {
    if (target instanceof TreeNode && contains(target)) {
      return f.apply((T) target);
    } else {
      return target;
    }
  }

  /**
   * Creates a copy of this type of tree node after a transformation. Must be overridden by child
   * classes that have constructor arguments that are not present in the productIterator.
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
      Preconditions.checkArgument(
          newArgs[i] != null, "argument is null in node [%s] , pls check", nodeName());
      argsKlazz[i] = newArgs[i].getClass();
    }
    for (Constructor<?> ctor : getClass().getConstructors()) {
      if (ctor.getParameterCount() == newArgs.length
          && ClassUtils.isAssignable(argsKlazz, ctor.getParameterTypes())) {
        candidate = ctor;
        break;
      }
    }
    Preconditions.checkArgument(candidate != null, "No valid constructor for %s", nodeName());
    try {
      return (T) candidate.newInstance(newArgs);
    } catch (InvocationTargetException
        | IllegalAccessException
        | InstantiationException
        | IllegalArgumentException e) {
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
      sb.append(' ');
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
     * @param msg  message
     */
    public TreeNodeException(TreeNode node, String msg) {
      super(String.format("tree: %s, message: %s", node.treeString(), msg));
    }

    /**
     * with message and throwable
     *
     * @param node the node
     * @param msg  the message
     * @param t    the exception
     */
    public TreeNodeException(TreeNode node, String msg, Throwable t) {
      super(String.format("tree: %s, message: %s", node.treeString(), msg), t);
    }
  }
}
