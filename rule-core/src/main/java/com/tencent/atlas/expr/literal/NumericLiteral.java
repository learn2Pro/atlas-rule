package com.tencent.atlas.expr.literal;

import com.tencent.atlas.expr.LeafExpression;
import com.tencent.atlas.model.Row;
import java.math.BigDecimal;
import reactor.core.publisher.Mono;

public class NumericLiteral extends LeafExpression<Number> {

    /**
     * the numeric literal number
     */
    private BigDecimal decimal;

    public NumericLiteral(BigDecimal decimal) {
        this.decimal = decimal;
    }

    public NumericLiteral(String numericSymbol) {
        this(numericSymbol, 10);
    }

    public NumericLiteral(String numericSymbol, int radix) {
        if (radix != 10) {
            this.decimal = new BigDecimal(Long.parseLong(numericSymbol, radix));
        } else {
            this.decimal = new BigDecimal(numericSymbol);
        }
    }

    @Override
    public Mono<Number> eval(Row row) {
        return Mono.just(decimal);
    }
}
