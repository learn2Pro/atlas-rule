package org.learn2pro.atlas.expr.func.builtin;

import org.learn2pro.atlas.expr.BinaryPredicate;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;
import reactor.core.publisher.Mono;

public class Like extends BinaryPredicate {

    /**
     * the left
     */
    private Expression<?> left;
    /**
     * the right
     */
    private Expression<?> right;

    public Like(Expression<?> left, Expression<?> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression<?> left() {
        return left;
    }

    @Override
    public Expression<?> right() {
        return right;
    }

    @Override
    public Mono<Boolean> eval(Row row) {
        return Mono.zip(left.eval(row).map(String::valueOf), right.eval(row).map(String::valueOf))
                .map(tuple -> {
                    String target = tuple.getT1();
                    String[] splits = tuple.getT2().split("%");
                    int index = 0;
                    for (String split : splits) {
                        if ((index = target.indexOf(split, index)) == -1) {
                            return false;
                        }
                    }
                    return true;
                });
    }
}
