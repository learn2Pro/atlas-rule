package org.learn2pro.atlas.expr.logic;

import org.learn2pro.atlas.expr.BinaryPredicate;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.Predicate;
import org.learn2pro.atlas.model.Row;
import reactor.core.publisher.Mono;

public class And extends BinaryPredicate {

    private Predicate left;
    private Predicate right;

    public And(Predicate left, Predicate right) {
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
        return left.eval(row).zipWhen(bool -> !bool ? Mono.just(false) : right.eval(row))
                .map(tuple2 -> tuple2.getT1() && tuple2.getT2());
    }
}
