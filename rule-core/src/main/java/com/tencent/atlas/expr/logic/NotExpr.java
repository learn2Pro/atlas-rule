package com.tencent.atlas.expr.logic;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.Predicate;
import com.tencent.atlas.expr.UnaryPredicate;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

public class NotExpr extends UnaryPredicate {

    private Predicate successor;

    public NotExpr(Predicate successor) {
        this.successor = successor;
    }

    @Override
    public Expression child() {
        return successor;
    }

    @Override
    public Mono<Boolean> eval(Row row) {
        return successor.eval(row).map(bool -> !bool);
    }

    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append("NOT ");
        sb.append(successor.symbol());
        return sb.toString();
    }
}
