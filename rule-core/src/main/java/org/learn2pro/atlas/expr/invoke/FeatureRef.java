package org.learn2pro.atlas.expr.invoke;

import com.google.common.collect.ImmutableList;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;
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
