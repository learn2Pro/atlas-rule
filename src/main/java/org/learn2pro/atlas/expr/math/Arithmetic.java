package org.learn2pro.atlas.expr.math;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;

public abstract class Arithmetic extends Expression {

  /**
   * generate numeric answer
   */
  @Override
  public abstract Number eval(Row row);

}
