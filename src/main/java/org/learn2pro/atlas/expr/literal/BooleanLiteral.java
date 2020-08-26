package org.learn2pro.atlas.expr.literal;

import org.learn2pro.atlas.model.Row;

public class BooleanLiteral extends ConstantExpr {

  public BooleanLiteral(String text) {
    super(Boolean.valueOf(text));
  }

  @Override
  public Boolean eval(Row row) {
    return (Boolean) super.eval(row);
  }
}
