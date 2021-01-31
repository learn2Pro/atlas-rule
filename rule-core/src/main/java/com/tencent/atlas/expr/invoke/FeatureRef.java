package com.tencent.atlas.expr.invoke;

import com.tencent.atlas.feature.com.google.common.collect.ImmutableList;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.model.Row;
import java.util.List;
import java.util.function.Function;
import reactor.core.publisher.Mono;

/**
 * feature ref from remote
 */
public class FeatureRef extends Expression {

    /**
     * feature define name
     */
    private String name;
    /**
     * the evaluate function
     */
    private Function<Row, Mono<Object>> runner;

    public FeatureRef(String name) {
        this.name = name;
    }

    /**
     * the constructor of feature
     *
     * @param name feature name
     * @param runner runner
     */
    public FeatureRef(String name, Function<Row, Mono<Object>> runner) {
        this.name = name;
        this.runner = runner;
    }

    @Override
    public Mono<Object> eval(Row row) {
        return runner.apply(row);
    }

    @Override
    public String symbol() {
        return "**" + name;
    }

    @Override
    public List<Expression> children() {
        return ImmutableList.of();
    }

    public void setRunner(Function<Row, Mono<Object>> runner) {
        this.runner = runner;
    }

    public String getName() {
        return name;
    }
}
