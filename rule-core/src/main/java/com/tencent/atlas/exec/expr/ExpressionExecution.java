package com.tencent.atlas.exec.expr;

import com.tencent.atlas.ann.Order;
import com.tencent.atlas.antlr.AtlasLexer;
import com.tencent.atlas.antlr.AtlasParser;
import com.tencent.atlas.antlr.AtlasParser.ExpressionContext;
import com.tencent.atlas.antlr.AtlasRuleVisitor;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.invoke.DataModelRef;
import com.tencent.atlas.feature.com.google.common.collect.Lists;
import com.tencent.atlas.feature.com.google.common.collect.Maps;
import com.tencent.atlas.feature.org.antlr.v4.runtime.BaseErrorListener;
import com.tencent.atlas.feature.org.antlr.v4.runtime.CharStream;
import com.tencent.atlas.feature.org.antlr.v4.runtime.CharStreams;
import com.tencent.atlas.feature.org.antlr.v4.runtime.CommonTokenStream;
import com.tencent.atlas.feature.org.antlr.v4.runtime.RecognitionException;
import com.tencent.atlas.feature.org.antlr.v4.runtime.Recognizer;
import com.tencent.atlas.feature.org.apache.commons.lang3.StringUtils;
import com.tencent.atlas.feature.org.reflections.Reflections;
import com.tencent.atlas.model.Row;
import com.tencent.atlas.transform.Resolver;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

/**
 * the standard expression execution the pipeline: compile --> resolve --> exec
 */
public class ExpressionExecution {

    public static final Logger LOGGER = LoggerFactory.getLogger(ExpressionExecution.class);
    /**
     * the antlr visitor
     */
    private transient static final AtlasRuleVisitor VISITOR = new AtlasRuleVisitor();
    /**
     * the ref scanner
     */
    private static final Reflections REF = new Reflections("com.tencent.atlas");
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
//        Preconditions.checkArgument(checkValid(rule), "this expression is not valid! `" + rule + "`");
        CharStream stream = CharStreams.fromString(rule);
        AtlasLexer lexer = new AtlasLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AtlasParser parser = new AtlasParser(tokens);
        parser.addErrorListener(new AtlasErrorListener());
        ExpressionContext tree = parser.expression();
        Expression expr = VISITOR.visit(tree);
        //token index + eof = token size
        for (int i = tree.getStop().getTokenIndex() + 1; i < tokens.getTokens().size(); i++) {
            if (tokens.getTokens().get(i).getType() >= 0
                    && !StringUtils.isEmpty(StringUtils.trim(tokens.getTokens().get(i).getText()))) {
                throw new AtlasExprException("missed some token in expression, pls check expression: " + rule);
            }
        }
        return expr;
    }

    /**
     * resolve the expression to executable expression
     * <p>like: inject runner to {@link com.tencent.atlas.expr.invoke.FeatureRef}<p/>
     * <p>like: inject runner to {@link DataModelRef}<p/>
     *
     * @param input the input expression
     * @return after resolved
     */
    public static Expression<?> resolve(final Expression<?> input) {
        Expression<?> afterResolve = input;
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
    public static Mono exec(String rule, Row input) {
        return resolve(compile(rule)).eval(input);
    }


    static class AtlasErrorListener extends BaseErrorListener {

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                String msg, RecognitionException e) {
            throw new AtlasExprException(msg, e);
        }

    }

    public static class AtlasExprException extends RuntimeException {

        /**
         * Constructs a new runtime exception with {@code null} as its detail message.  The cause is not initialized,
         * and may subsequently be initialized by a call to {@link #initCause}.
         */
        public AtlasExprException() {
        }

        /**
         * Constructs a new runtime exception with the specified detail message. The cause is not initialized, and may
         * subsequently be initialized by a call to {@link #initCause}.
         *
         * @param message the detail message. The detail message is saved for later retrieval by the {@link
         *         #getMessage()} method.
         */
        public AtlasExprException(String message) {
            super(message);
        }

        /**
         * Constructs a new runtime exception with the specified detail message and cause.  <p>Note that the detail
         * message associated with {@code cause} is <i>not</i> automatically incorporated in this runtime exception's
         * detail message.
         *
         * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()}
         *         method).
         * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method).  (A
         *         <tt>null</tt> value is permitted, and indicates that the cause is nonexistent or unknown.)
         * @since 1.4
         */
        public AtlasExprException(String message, Throwable cause) {
            super(message, cause);
        }
    }

}
