package com.tencent.atlas.expr.invoke;

import com.tencent.atlas.feature.com.google.common.collect.ImmutableList;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.model.Row;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * attribute ref from request
 */
public class AttributeRef extends Expression<Object> {

    /**
     * feature define name
     */
    private String name;

    public AttributeRef(String name) {
        this.name = name;
    }

    @Override
    public Mono<Object> eval(Row row) {
        return Mono.justOrEmpty(row.getByName(name));
    }

    @Override
    public String symbol() {
        return "$$" + name;
    }

    @Override
    public List<Expression> children() {
        return ImmutableList.of();
    }

    public String getName() {
        return name;
    }
}
