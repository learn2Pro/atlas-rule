package com.tencent.atlas.transform;

import com.tencent.atlas.expr.Expression;

/**
 * the resolver for expression tree
 */
public interface Resolver {

    /**
     * resolve the expression and inject needed variable
     *
     * @param input the input expression
     * @return resolved expression
     */
    Expression<?> resolve(Expression<?> input);

}
