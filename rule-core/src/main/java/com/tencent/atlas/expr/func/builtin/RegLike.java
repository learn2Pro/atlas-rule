package com.tencent.atlas.expr.func.builtin;

import com.tencent.atlas.feature.com.google.common.base.Preconditions;
import com.tencent.atlas.expr.BinaryPredicate;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.literal.ConstantExpr;
import com.tencent.atlas.model.Row;
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
                .map(word -> pattern.matcher(word).find());
    }

    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append(left.symbol());
        sb.append(" RLIKE ");
        sb.append(right.symbol());
        return sb.toString();
    }
}
