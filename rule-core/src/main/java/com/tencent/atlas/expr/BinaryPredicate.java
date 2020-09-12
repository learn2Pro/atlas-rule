package com.tencent.atlas.expr;

import com.google.common.collect.ImmutableList;
import java.util.List;

/**
 * predicate if/not
 */
public abstract class BinaryPredicate extends Predicate {

    /**
     * @return left predicate
     */
    public abstract Expression left();

    /**
     * @return right predicate
     */
    public abstract Expression right();

    @Override
    public List<Expression> children() {
        return ImmutableList.of(left(), right());
    }

}
