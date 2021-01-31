package com.tencent.atlas.expr;

import com.tencent.atlas.feature.com.google.common.collect.ImmutableList;
import java.util.List;

/**
 * predicate if/not
 */
public abstract class UnaryPredicate extends Predicate {

    public abstract Expression child();

    @Override
    public List<Expression> children() {
        return ImmutableList.of(child());
    }

}
