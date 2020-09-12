package com.tencent.atlas.expr.literal;

/**
 * bool expression
 */
public class BooleanLiteral extends ConstantExpr<Boolean> {

    /**
     * the bool value
     */
    private boolean value;

    public BooleanLiteral(String text) {
        this.value = (Boolean.parseBoolean(text));
    }

    @Override
    public Boolean item() {
        return this.value;
    }
}
