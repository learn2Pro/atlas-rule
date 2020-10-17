package org.learn2pro.atlas.expr.func.builtin;

import com.google.common.base.Preconditions;
import org.learn2pro.atlas.expr.BinaryPredicate;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.literal.ConstantExpr;
import org.learn2pro.atlas.model.Row;
import java.time.Duration;
import java.util.regex.Pattern;
import reactor.core.publisher.Mono;

public class RegLike extends BinaryPredicate {

    /**
     * the left
     */
    private Expression<?> left;
    /**
     * the right
     */
    private Expression<?> right;

    private Pattern pattern;

    public RegLike(Expression<?> left, Expression<?> right) {
        this.left = left;
        this.right = right;
        Preconditions.checkArgument(right instanceof ConstantExpr, "the pattern only support the constant literal!");
        String pattern = right.eval(null).map(String::valueOf).block(Duration.ofMillis(200));
        this.pattern = Pattern.compile(pattern);
    }

    public RegLike(Expression<?> left, Expression<?> right, Pattern pattern) {
        this.left = left;
        this.right = right;
        this.pattern = pattern;
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
        return Mono.from(left.eval(row).map(String::valueOf))
                .map(word -> {
                    return pattern.matcher(word).find();
                });
    }
}
