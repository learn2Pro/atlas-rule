package org.learn2pro.atlas.expr.logic;

import org.learn2pro.atlas.expr.BinaryPredicate;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.Predicate;
import org.learn2pro.atlas.model.Row;

public class Or extends BinaryPredicate {

  private Predicate left;
  private Predicate right;

  public Or(Predicate left, Predicate right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public Expression left() {
    return left;
  }

  @Override
  public Expression right() {
    return right;
  }

  @Override
  public Boolean eval(Row row) {
    return left.eval(row) || right.eval(row);
  }
}
