package org.learn2pro.atlas.expr.literal;

public class StringLiteral extends ConstantExpr<String> {

    /**
     * the string literal inner value
     */
    private String value;

    public StringLiteral(String text) {
        this.value = text;
    }

    @Override
    public String item() {
        return value;
    }
}