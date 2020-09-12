package com.tencent.atlas.expr.logic;

import com.tencent.atlas.expr.BinaryPredicate;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.Predicate;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

public class Or extends BinaryPredicate {

    private Predicate left;
    private Predicate right;

    public Or(Predicate left, Predicate right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public Mono<Boolean> eval(Row row) {
        return left.eval(row).zipWhen(bool -> bool ? Mono.just(true) : right.eval(row))
                .map(tuple2 -> tuple2.getT1() || tuple2.getT2());
    }
}
