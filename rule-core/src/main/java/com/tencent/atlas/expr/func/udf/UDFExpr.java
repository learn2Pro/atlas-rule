package com.tencent.atlas.expr.func.udf;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.ExpressionGroup;
import com.tencent.atlas.model.Row;
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
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(parameters.symbol());
        return sb.toString();
    }

    @Override
    public List<Expression> children() {
        return parameters.children();
    }

    public String getName() {
        return name;
    }
}
