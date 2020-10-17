package org.learn2pro.atlas.expr.func.udf;

import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.model.Row;
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
