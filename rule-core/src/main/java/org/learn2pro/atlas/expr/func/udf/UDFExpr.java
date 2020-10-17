package org.learn2pro.atlas.expr.func.udf;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.model.Row;
import java.util.List;
import reactor.core.publisher.Mono;

public class UDFExpr extends Expression {

    /**
     * the udf name
     */
    private String name;
    /**
     * the udf parameters
     */
    private ExpressionGroup parameters;

    public UDFExpr(String name, ExpressionGroup parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public Mono<?> eval(Row row) {
        return UDFRegistry.eval(name, row, parameters);
    }

    @Override
    public List<Expression> children() {
        return parameters.children();
    }
}
