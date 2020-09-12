package com.tencent.atlas.expr.func.udf;

import com.tencent.atlas.expr.ExpressionGroup;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

/**
 * udf unit runner
 */
public interface UDFRunner<T> {

    /**
     * evaluate
     */
    Mono<T> eval(Row row, ExpressionGroup group);

}
