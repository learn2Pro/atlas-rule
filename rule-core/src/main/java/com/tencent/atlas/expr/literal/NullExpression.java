package com.tencent.atlas.expr.literal;

import com.tencent.atlas.expr.LeafExpression;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

public class NullExpression extends LeafExpression<Object> {

    /**
     * is null?
     */
    private boolean nullable;

    public NullExpression(boolean nullable) {
        this.nullable = nullable;
    }

    @Override
    public Mono<Object> eval(Row row) {
        return Mono.fromSupplier(() -> nullable ? null : new Object());
    }

}
