package com.tencent.atlas.expr.literal;

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

    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        sb.append(value);
        sb.append('\'');
        return sb.toString();
    }
}