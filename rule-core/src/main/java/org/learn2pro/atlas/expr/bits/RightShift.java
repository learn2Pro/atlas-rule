package org.learn2pro.atlas.expr.bits;

import com.google.common.collect.ImmutableList;
import org.learn2pro.atlas.ann.MathOp;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.math.BinaryArithmetic;
import org.learn2pro.atlas.model.Row;
import java.util.List;
import reactor.core.publisher.Mono;

@MathOp(">>")
public class RightShift extends BinaryArithmetic {

    /**
     * left expression
     */
    private Expression<?> left;
    /**
     * right expression
     */
    private Expression<?> right;

    public RightShift(Expression left, Expression right) {
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
                    return ((Number) tuple.getT1()).longValue() << shift;
                });
    }

    @Override
    public List<Expression> children() {
        return ImmutableList.of(left, right);
    }
}
