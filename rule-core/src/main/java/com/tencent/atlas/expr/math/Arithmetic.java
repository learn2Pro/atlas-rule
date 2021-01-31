package com.tencent.atlas.expr.math;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.model.Row;
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
