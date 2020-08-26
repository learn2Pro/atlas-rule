package org.learn2pro.atlas.expr;

import com.google.common.collect.ImmutableList;
import java.util.List;

/**
 * predicate if/not
 */
public abstract class BinaryPredicate extends Predicate {

  public abstract Expression left();

  public abstract Expression right();

  @Override
  public List<Expression> children() {
    return ImmutableList.of(left(), right());
  }

}
