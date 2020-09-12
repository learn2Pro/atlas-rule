package com.tencent.atlas.expr;

import com.tencent.atlas.model.Row;
import com.tencent.atlas.model.TreeNode;
import reactor.core.publisher.Mono;

/**
 * the base expression impl
 */
public abstract class Expression<T> extends TreeNode<Expression> {

    /**
     * the constructor
     */
    public Expression() {
        super(Expression.class);
    }

    /**
     * evaluate the expression
     *
     * @param row input
     * @return after eval
     */
    public abstract Mono<T> eval(Row row);

    public String genCode() {
        throw new UnsupportedOperationException("not supported code gen now!");
    }
}