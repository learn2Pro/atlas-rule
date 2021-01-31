package com.tencent.atlas.expr;

import com.tencent.atlas.feature.com.google.common.collect.ImmutableList;
import java.util.List;

/**
 * the base expression impl
 */
public abstract class LeafExpression<T> extends Expression<T> {

    @Override
    public List<Expression> children() {
        return ImmutableList.of();
    }

}
