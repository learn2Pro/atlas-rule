package com.tencent.test.atlas.rule;

import com.google.common.base.Preconditions;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.Predicate;
import com.tencent.atlas.model.Row;
import java.time.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * rule execution runtime
 */
public class RuleExecution {

    public static final Logger LOGGER = LoggerFactory.getLogger(RuleExecution.class);

    /**
     * rule symbol to compile
     * <p> **a > 10 <p/>
     * <p> **a > 10 and **b < 5 <p/>
     * <p> **b like '%abc%' <p/>
     *
     * @param rule the rule text
     * @return return compiled predicate
     */
    public static Predicate compileAndResolve(String rule) {
        Expression<?> compiled = ExpressionExecution.compile(rule);
        Expression<?> resolved = ExpressionExecution.resolve(compiled);
        Preconditions
                .checkArgument(resolved instanceof Predicate, "rule expression must be a predicate, see :[%s]", rule);
        return (Predicate) resolved;
    }

    /**
     * validate the rule text?
     *
     * @param rule the rule text
     * @return validate or not
     */
    public static boolean validate(String rule) {
        try {
            compileAndResolve(rule);
            return true;
        } catch (Exception e) {
            LOGGER.error("rule `{}` is not valid!", rule);
            return false;
        }
    }

    /**
     * execute the user-defined rule with input
     *
     * @param rule the rule text
     * @param input the input params
     * @return pass or not
     */
    public static boolean exec(String rule, Row input) throws RuntimeException {
        Predicate predicate = compileAndResolve(rule);
        Mono<Boolean> mono = predicate.eval(input);
        mono.subscribeOn(Schedulers.boundedElastic());
        return mono.block(Duration.ofMillis(200));
    }

}
