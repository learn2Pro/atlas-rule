package com.tencent.atlas.expr;

import com.tencent.atlas.model.InternalRow;
import com.tencent.atlas.model.Row;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

public class ExpressionGroup extends Expression<InternalRow> {

    private List<Expression<?>> expressions;

    public ExpressionGroup(List<Expression<?>> expressions) {
        this.expressions = expressions;
    }

    @Override
    public Mono<InternalRow> eval(Row row) {
        return Mono.zip(expressions.stream().map(e -> e.eval(row)).collect(Collectors.toList()), InternalRow::new);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Expression> children() {
        return (List) expressions;
    }

    /**
     * get expression in index
     *
     * @param index where
     */
    public Expression<?> get(int index) {
        return Optional.ofNullable(expressions).map(inner -> inner.get(index)).orElse(null);
    }

    /**
     * first expression
     */
    public Expression<?> first() {
        return Optional.ofNullable(expressions).map(inner -> inner.get(0)).orElse(null);
    }

    /**
     * the size
     */
    public int size() {
        return Optional.ofNullable(expressions).map(List::size).orElse(0);
    }
}
