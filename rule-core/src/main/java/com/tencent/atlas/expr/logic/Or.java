package com.tencent.atlas.expr.logic;

import com.tencent.atlas.expr.BinaryPredicate;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Or extends BinaryPredicate {

    /**
     * the left expression
     */
    private Expression<?> left;
    /**
     * the right expression
     */
    private Expression<?> right;

    public Or(Expression<?> left, Expression<?> right) {
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
        return left.eval(row).flatMap(ans -> {
            Boolean predicate = (Boolean) ans;
            if (!predicate) {
                return (Mono<Boolean>) right.eval(row);
            } else {
                return Mono.justOrEmpty(true);
            }
        });
    }

    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append(left.symbol());
        sb.append(" OR ");
        sb.append(right.symbol());
        return sb.toString();
    }
}
