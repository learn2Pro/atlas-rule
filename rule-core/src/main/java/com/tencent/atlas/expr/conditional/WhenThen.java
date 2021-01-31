package com.tencent.atlas.expr.conditional;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.Predicate;
import com.tencent.atlas.feature.com.google.common.collect.ImmutableList;
import com.tencent.atlas.model.Row;
import java.util.List;
import reactor.core.publisher.Mono;

public class WhenThen extends Expression<Object> {

    /**
     * the predicate condition
     */
    private Predicate condition;
    /**
     * the output expression
     */
    private Expression consequent;

    public WhenThen(Predicate condition, Expression consequent) {
        this.condition = condition;
        this.consequent = consequent;
    }

    /**
     * evaluate the expression
     *
     * @param row input
     * @return after eval
     */
    @Override
    public Mono<Object> eval(Row row) {
        return condition.eval(row).flatMap(ans -> {
            if (ans) {
                return consequent.eval(row);
            } else {
                return Mono.empty();
            }
        });
    }

    /**
     * @return the symbol of expression
     */
    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append("WHEN ");
        sb.append(condition.symbol());
        sb.append(' ');
        sb.append("THEN ");
        sb.append(consequent.symbol());
        return sb.toString();
    }

    /**
     * the children instance
     *
     * @return the children
     */
    @Override
    public List<Expression> children() {
        return ImmutableList.of(condition, consequent);
    }
}
