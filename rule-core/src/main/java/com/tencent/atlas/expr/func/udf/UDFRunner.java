package com.tencent.atlas.expr.func.udf;

import com.tencent.atlas.expr.ExpressionGroup;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

/**
 * udf unit runner in sql expression
 * <p>like concat($$uid,1,2), the parameter like below:<p/>
 * <ul>
 *     <li>$$uid</li>
 *     <li>1</li>
 *     <li>2<li/>
 * </ul>
 */
@FunctionalInterface
public interface UDFRunner<T> {

    /**
     * evaluate
     */
    Mono<T> eval(Row row, ExpressionGroup group);

}
