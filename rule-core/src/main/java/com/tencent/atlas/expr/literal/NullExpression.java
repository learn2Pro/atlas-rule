package com.tencent.atlas.expr.literal;

import com.tencent.atlas.expr.LeafExpression;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

public class NullExpression extends LeafExpression<Object> {

    public static final Object NULL_OBJECT = new Object();
    public static final Object NOT_NULL_OBJECT = new Object();
    /**
     * is null?
     */
    private boolean nullable;

    public NullExpression(boolean nullable) {
        this.nullable = nullable;
    }

    @Override
    public Mono<Object> eval(Row row) {
        return Mono.fromSupplier(() -> nullable ? NULL_OBJECT : NOT_NULL_OBJECT);
    }

    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        if (nullable) {
            sb.append("NULL");
        } else {
            sb.append("NOT NULL");
        }
        return sb.toString();
    }

}
