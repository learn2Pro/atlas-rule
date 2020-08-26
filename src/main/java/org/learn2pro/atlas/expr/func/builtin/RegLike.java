package org.learn2pro.atlas.expr.func.builtin;

import org.learn2pro.atlas.expr.BinaryPredicate;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;
import java.util.regex.Pattern;

public class RegLike extends BinaryPredicate {

  /**
   * the left
   */
  private Expression left;
  /**
   * the right
   */
  private Expression right;

  private Pattern pattern;

  public RegLike(Expression left, Expression right) {
    this.left = left;
    this.right = right;
    this.pattern = Pattern.compile(String.valueOf(right.eval(null)));
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
    String target = String.valueOf(left.eval(row));
    return pattern.matcher(target).find();
  }
}
