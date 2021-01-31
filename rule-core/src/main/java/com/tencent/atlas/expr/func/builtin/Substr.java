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
    /**
     * the start index expression
     */
    private Expression<?> startExpr;
    /**
     * the size of sub action
     */
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
                    int end = Math.min(ref.length(), size == -1 ? ref.length() : start + size);
                    if (start >= end) {
                        return "";
                    }
                    return ref.substring(start, end);
                });
    }

    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append("SUBSTR(");
        sb.append(successor.symbol());
        sb.append(", ");
        sb.append(startExpr.symbol());
        if (sizeExpr == null) {
            sb.append(')');
        } else {
            sb.append(", ");
            sb.append(sizeExpr.symbol());
            sb.append(')');
        }
        return sb.toString();
    }
}
