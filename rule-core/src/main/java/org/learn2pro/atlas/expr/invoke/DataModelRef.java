package org.learn2pro.atlas.expr.invoke;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.model.Row;
import java.util.List;
import java.util.function.Function;
import reactor.core.publisher.Mono;

/**
 * data view invocation
 */
public class DataModelRef extends Expression<Object> {

    /**
     * view name
     */
    private String name;
    /**
     * parameter of expression
     */
    private ExpressionGroup params;
    /**
     * the runner of data view
     */
    private Function<Row, Mono<Object>> runner;

    /**
     * the data view constructor
     *
     * @param name the view name
     * @param params the parameters
     * @param runner the runner
     */
    public DataModelRef(String name, ExpressionGroup params, Function<Row, Mono<Object>> runner) {
        this.name = name;
        this.params = params;
        this.runner = runner;
    }

    /**
     * the data view ref
     *
     * @param name the view name
     * @param params the params
     */
    public DataModelRef(String name, ExpressionGroup params) {
        this.name = name;
        this.params = params;
    }

    @Override
    public Mono<Object> eval(Row row) {
        return runner.apply(row);
    }

    @Override
    public List<Expression> children() {
        return params.children();
    }

    public String getName() {
        return name;
    }

    /**
     * @return the expression params
     */
    public ExpressionGroup getParams() {
        return params;
    }

    public void setRunner(
            Function<Row, Mono<Object>> runner) {
        this.runner = runner;
    }
}
