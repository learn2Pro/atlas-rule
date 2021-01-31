package com.tencent.atlas.expr.func.builtin;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.UnaryExpression;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

public class GetLength extends UnaryExpression<Integer> {

    /**
     * the next
     */
    private Expression<?> successor;

    public GetLength(Expression<?> successor) {
        this.successor = successor;
    }

    @Override
    public Expression<?> child() {
        return successor;
    }

    @Override
    public Mono<Integer> eval(Row row) {
        return Mono.from(successor.eval(row)).map(output -> String.valueOf(output).length());
    }

    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append("CHAR_LENGTH(");
        sb.append(successor.symbol());
        sb.append(')');
        return sb.toString();
    }
}
