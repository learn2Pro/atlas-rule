package org.learn2pro.atlas.expr.literal;

import org.learn2pro.atlas.expr.LeafExpression;
import org.learn2pro.atlas.model.Row;
import java.math.BigDecimal;

public class NumericLiteral extends LeafExpression {

  private BigDecimal decimal;

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
  public Number eval(Row row) {
    return decimal;
  }
}
