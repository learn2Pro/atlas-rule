package org.learn2pro.atlas.expr;

import com.google.common.collect.ImmutableList;
import org.learn2pro.atlas.model.Row;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * symbol class for text container
 */
public class SymbolHolder extends Expression {

    /**
     * symbol
     */
    private String symbol;

    public SymbolHolder(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public Mono<?> eval(Row row) {
        throw new UnsupportedOperationException("this expression not support eval");
    }

    @Override
    public List<Expression> children() {
        return ImmutableList.of();
    }

    public String getSymbol() {
        return symbol;
    }
}
