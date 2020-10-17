package org.learn2pro.atlas.expr.literal;

import org.learn2pro.atlas.expr.LeafExpression;
import org.learn2pro.atlas.model.Row;
import reactor.core.publisher.Mono;

/**
 * the constant expression
 */
public abstract class ConstantExpr<T> extends LeafExpression<T> {

    public abstract T item();

    @Override
    public Mono<T> eval(Row row) {
        return Mono.just(item());
    }
}
