package org.learn2pro.atlas.transform;

import org.learn2pro.atlas.expr.Expression;

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
