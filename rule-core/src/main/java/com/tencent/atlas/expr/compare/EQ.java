package com.tencent.atlas.expr.compare;

import com.tencent.atlas.ann.CmpOp;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.model.Row;
import java.util.Objects;
import reactor.core.publisher.Mono;

@CmpOp("=")
public class EQ extends CompareExpr {

    /**
     * left expr
     */
    private Expression<?> left;
    /**
     * right expr
     */
    private Expression<?> right;

    public EQ(Expression left, Expression right) {
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
        return Mono.zip(left.eval(row), right.eval(row)).map(tuple -> {
            if (tuple.getT2() instanceof Number && tuple.getT1() instanceof Number) {
                return Objects.equals(((Number) tuple.getT1()).doubleValue(), ((Number) tuple.getT2()).doubleValue());
            }
            return Objects.equals(tuple.getT1(), tuple.getT2());
        });
    }

    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append(left.symbol());
        sb.append('=');
        sb.append(right.symbol());
        return sb.toString();
    }
}
