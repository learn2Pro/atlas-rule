package com.tencent.atlas.expr.compare;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.literal.NullExpression;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

public class IsOrNotNull extends CompareExpr {

    /**
     * left expr
     */
    private Expression<?> left;
    /**
     * right expr
     */
    private Expression<?> right;

    public IsOrNotNull(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public Mono<Boolean> eval(Row row) {
        return Mono
                .zip(left.eval(row).map(e -> NullExpression.NOT_NULL_OBJECT).defaultIfEmpty(NullExpression.NULL_OBJECT),
                        right.eval(row))
                .map(tuple -> {
                    return tuple.getT1() == tuple.getT2();
                });
    }


    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append(left.symbol());
        sb.append(" IS ");
        sb.append(right.symbol());
        return sb.toString();
    }
}
