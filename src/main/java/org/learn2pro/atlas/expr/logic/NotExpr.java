package org.learn2pro.atlas.expr.logic;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.Predicate;
import org.learn2pro.atlas.expr.UnaryPredicate;
import org.learn2pro.atlas.model.Row;

public class NotExpr extends UnaryPredicate {

  private Predicate successor;

  public NotExpr(Predicate successor) {
    this.successor = successor;
  }

  @Override
  public Expression child() {
    return successor;
  }

  @Override
  public Boolean eval(Row row) {
    return !successor.eval(row);
  }
}
