package org.learn2pro.atlas.expr.compare;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;
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
        return Mono.zip(left.eval(row), right.eval(row))
                .map(tuple -> (tuple.getT1() == null) == (tuple.getT2() == null));
    }
}
