package com.tencent.atlas.expr.func.builtin;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.UnaryExpression;
import com.tencent.atlas.expr.literal.NumericLiteral;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

public class Substr extends UnaryExpression<String> {

    /**
     * the child
     */
    private Expression<?> successor;
    private Expression<?> startExpr;
    private Expression<?> sizeExpr;

    public Substr(Expression<?> successor, Expression<?> start) {
        this(successor, start, new NumericLiteral("-1"));
    }

    public Substr(Expression<?> successor, Expression<?> start, Expression<?> size) {
        this.successor = successor;
        this.startExpr = start;
        this.sizeExpr = size;
    }

    @Override
    public Expression<?> child() {
        return successor;
    }

    @Override
    public Mono<String> eval(Row row) {
        return Mono.zip(successor.eval(row).map(String::valueOf), startExpr.eval(row), sizeExpr.eval(row))
                .map(tuple3 -> {
                    String ref = tuple3.getT1();
                    int start = ((Number) tuple3.getT2()).intValue();
                    int size = ((Number) tuple3.getT3()).intValue();
                    int end = size == -1 ? ref.length() : start + size;
                    return ref.substring(start, end);
                });
    }
}
