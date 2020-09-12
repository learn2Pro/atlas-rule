package com.tencent.atlas.expr.compare;

import com.tencent.atlas.ann.CmpOp;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

@CmpOp("<=")
public class LE extends CompareExpr {

    /**
     * left expr
     */
    private Expression<?> left;
    /**
     * right expr
     */
    private Expression<?> right;

    public LE(Expression left, Expression right) {
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
                .map(tuple -> MATH_TOOL.sub(tuple.getT1(), tuple.getT2()).doubleValue() <= 0.0);
    }
}
