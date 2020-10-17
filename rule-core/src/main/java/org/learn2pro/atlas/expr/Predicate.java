package org.learn2pro.atlas.expr;

import org.learn2pro.atlas.model.Row;
import reactor.core.publisher.Mono;

/**
 * predicate if/not
 */
public abstract class Predicate extends Expression<Boolean> {

    /**
     * generate bool answer
     *
     * @return
     */
    @Override
    public abstract Mono<Boolean> eval(Row row);
}
