package org.learn2pro.atlas.expr.math;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;
import reactor.core.publisher.Mono;

public abstract class Arithmetic extends Expression<Number> {

    /**
     * generate numeric answer
     *
     * @return
     */
    @Override
    public abstract Mono<Number> eval(Row row);

}
