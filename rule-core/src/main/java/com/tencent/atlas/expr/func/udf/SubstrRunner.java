package com.tencent.atlas.expr.func.udf;

import com.tencent.atlas.ann.UDF;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.ExpressionGroup;
import com.tencent.atlas.expr.literal.NumericLiteral;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

@UDF({"substr", "SUBSTR"})
public class SubstrRunner implements UDFRunner<String> {

    @Override
    public Mono<String> eval(Row row, ExpressionGroup group) {
        Expression<?> successor = group.get(0);
        Expression<?> startExpr = group.get(1);
        Expression<?> sizeExpr = group.size() <= 2 ? new NumericLiteral("-1") : group.get(2);
        return Mono.zip(successor.eval(row).map(String::valueOf), startExpr.eval(row), sizeExpr.eval(row))
                .map(tuple3 -> {
                    String ref = tuple3.getT1();
                    int start = ((Number) tuple3.getT2()).intValue();
                    int size = ((Number) tuple3.getT3()).intValue();
                    int end = Math.min(ref.length(), size == -1 ? ref.length() : start + size);
                    if (start >= end) {
                        return "";
                    }
                    return ref.substring(start, end);
                });
    }
}
