package org.learn2pro.atlas.expr.func.udf;

import org.learn2pro.atlas.ann.UDF;
import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.model.Row;
import reactor.core.publisher.Mono;

@UDF({"char_length", "CHAR_LENGTH"})
public class CharLengthRunner implements UDFRunner<Integer> {

    @Override
    public Mono<Integer> eval(Row row, ExpressionGroup group) {
        return Mono.from(group.first().eval(row).map(String::valueOf).map(String::length));
    }
}
