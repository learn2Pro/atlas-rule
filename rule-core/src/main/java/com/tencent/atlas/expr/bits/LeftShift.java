package com.tencent.atlas.expr.bits;

import com.google.common.collect.ImmutableList;
import com.tencent.atlas.ann.MathOp;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.math.BinaryArithmetic;
import com.tencent.atlas.model.Row;
import java.util.List;
import reactor.core.publisher.Mono;

@MathOp("<<")
public class LeftShift extends BinaryArithmetic {

    /**
     * left expression
     */
    private Expression<?> left;
    /**
     * right expression
     */
    private Expression<?> right;

    public LeftShift(Expression left, Expression right) {
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
    public Mono<Number> eval(Row row) {
        return Mono.zip(left.eval(row), right.eval(row))
                .map(tuple -> {
                    int shift = ((Number) tuple.getT2()).intValue();
                    return ((Number) tuple.getT1()).longValue() >>> shift;
                });
    }

    @Override
    public List<Expression> children() {
        return ImmutableList.of(left, right);
    }
}