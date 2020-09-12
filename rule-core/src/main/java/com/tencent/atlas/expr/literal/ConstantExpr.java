package com.tencent.atlas.expr.literal;

import com.tencent.atlas.expr.LeafExpression;
import com.tencent.atlas.model.Row;
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
