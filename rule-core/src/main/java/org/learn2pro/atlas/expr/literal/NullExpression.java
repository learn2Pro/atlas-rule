package org.learn2pro.atlas.expr.literal;

import org.learn2pro.atlas.expr.LeafExpression;
import org.learn2pro.atlas.model.Row;
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
