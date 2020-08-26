package org.learn2pro.atlas.expr.literal;

import org.learn2pro.atlas.expr.LeafExpression;
import org.learn2pro.atlas.model.Row;

public class StringLiteral extends LeafExpression {

  /**
   * the string text
   */
  private String text;

  public StringLiteral(String text) {
    this.text = text == null ? null : text.substring(1, text.length() - 1);
  }

  @Override
  public String eval(Row row) {
    return text;
  }
}
