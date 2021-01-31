package com.tencent.atlas.expr.logic;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.Predicate;
import com.tencent.atlas.feature.com.google.common.collect.ImmutableList;
import com.tencent.atlas.model.Row;
import java.util.List;
import reactor.core.publisher.Mono;

public class IsExpression extends Predicate {

    /**
     * the left expression
     */
    private Predicate left;
    /**
     * is in or not in
     */
    private boolean isOrNot;
    /**
     * the test value
     */
    private boolean testify;

    public IsExpression(Predicate left, boolean isOrNot, boolean testify) {
        this.left = left;
        this.isOrNot = isOrNot;
        this.testify = testify;
    }

    /**
     * generate bool answer
     *
     * @param row
     * @return
     */
    @Override
    public Mono<Boolean> eval(Row row) {
        return left.eval(row).map(e -> {
            return isOrNot == (e == testify);
        });
    }

    /**
     * @return the symbol of expression
     */
    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append(left.symbol());
        sb.append(" IS");
        if (!isOrNot) {
            sb.append("NOT ");
        }
        if (testify) {
            sb.append("TRUE");
        } else {
            sb.append("FALSE");
        }
        return sb.toString();
    }

    /**
     * the children instance
     *
     * @return the children
     */
    @Override
    public List<Expression> children() {
        return ImmutableList.of(left);
    }
}
