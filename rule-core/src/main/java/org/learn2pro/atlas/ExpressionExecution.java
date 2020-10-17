package org.learn2pro.atlas;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.learn2pro.atlas.ann.Order;
import org.learn2pro.atlas.antlr.AtlasLexer;
import org.learn2pro.atlas.antlr.AtlasParser;
import org.learn2pro.atlas.antlr.AtlasRuleVisitor;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.expr.invoke.DataModelRef;
import org.learn2pro.atlas.model.Row;
import org.learn2pro.atlas.transform.Resolver;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.learn2pro.atlas.expr.invoke.FeatureRef;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * the standard expression execution the pipeline: compile --> resolve --> exec
 */
public class ExpressionExecution {

    public static final Logger LOGGER = LoggerFactory.getLogger(ExpressionExecution.class);
    /**
     * the antlr visitor
     */
    private static final AtlasRuleVisitor VISITOR = new AtlasRuleVisitor();
    /**
     * the ref scanner
     */
    private static final Reflections REF = new Reflections("org.learn2pro.atlas");
    private static final TreeMap<Integer, List<Resolver>> RESOLVERS = Maps.newTreeMap();

    static {
        REF.getSubTypesOf(Resolver.class).forEach(ExpressionExecution::registerResolver);
    }

    public static void registerResolver(Class<? extends Resolver> klass) {
        try {
            int priority = Optional.ofNullable(klass.getAnnotation(Order.class)).map(Order::value).orElse(10);
            List<Resolver> level = RESOLVERS.getOrDefault(priority, Lists.newArrayList());
            level.add(klass.newInstance());
            RESOLVERS.put(priority, level);
        } catch (InstantiationException | IllegalAccessException e) {
            LOGGER.error("instantiate this resolver :{} failed, pls check!", klass, e);
        }
    }


    /**
     * rule symbol to compile
     * <p> **a > 10 <p/>
     * <p> **a > 10 and **b < 5 <p/>
     * <p> **b like '%abc%' <p/>
     *
     * @param rule the rule text
     * @return return compiled predicate
     */
    public static Expression compile(String rule) {
        CharStream stream = CharStreams.fromString(rule);
        AtlasLexer lexer = new AtlasLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AtlasParser parser = new AtlasParser(tokens);
        ExpressionGroup group = (ExpressionGroup) VISITOR.visit(parser.expressions());
        Preconditions.checkArgument(group.size() == 1, "only support one expression,pls check!");
        return group.first();
    }

    /**
     * resolve the expression to executable expression
     * <p>like: inject runner to {@link FeatureRef}<p/>
     * <p>like: inject runner to {@link DataModelRef}<p/>
     *
     * @param input the input expression
     * @return after resolved
     */
    public static Expression<?> resolve(final Expression<?> input) {
        Expression<?> afterResolve = null;
        for (Entry<Integer, List<Resolver>> entry : RESOLVERS.entrySet()) {
            for (Resolver resolver : entry.getValue()) {
                afterResolve = resolver.resolve(input);
            }
        }
        return afterResolve;
    }

    /**
     * execute the user-defined rule with input
     *
     * @param rule the rule text
     * @param input the input params
     * @return pass or not
     */
    public static Object exec(String rule, Row input) {
        return resolve(compile(rule)).eval(input);
    }

}
