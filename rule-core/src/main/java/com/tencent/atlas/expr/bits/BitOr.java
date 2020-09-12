package com.tencent.atlas.expr.bits;

import com.google.common.collect.ImmutableList;
import com.tencent.atlas.ann.MathOp;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.math.BinaryArithmetic;
import com.tencent.atlas.model.Row;
import java.util.List;
import reactor.core.publisher.Mono;

@MathOp("|")
public class BitOr extends BinaryArithmetic {

    /**
     * left expression
     */
    private Expression<?> left;
    /**
     * right expression
     */
    private Expression<?> right;

    public BitOr(Expression left, Expression right) {
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
                .map(tuple -> MATH_TOOL.bitwiseXOr(tuple.getT1(), tuple.getT2()));
    }

    @Override
    public List<Expression> children() {
        return ImmutableList.of(left, right);
    }
}