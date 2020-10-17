package org.learn2pro.atlas.expr.func.builtin;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.UnaryExpression;
import org.learn2pro.atlas.model.Row;
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
}
