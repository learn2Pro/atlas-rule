package com.tencent.atlas.expr.func.udf;

import com.tencent.atlas.ann.UDF;
import com.tencent.atlas.expr.ExpressionGroup;
import com.tencent.atlas.model.Row;
import reactor.core.publisher.Mono;

@UDF({"char_length", "CHAR_LENGTH"})
public class CharLengthRunner implements UDFRunner<Integer> {

    @Override
    public Mono<Integer> eval(Row row, ExpressionGroup group) {
        return Mono.from(group.first().eval(row).map(String::valueOf).map(String::length));
    }
}
