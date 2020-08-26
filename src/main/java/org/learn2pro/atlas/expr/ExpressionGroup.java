package org.learn2pro.atlas.expr;

import org.learn2pro.atlas.model.InternalRow;
import org.learn2pro.atlas.model.Row;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExpressionGroup extends Expression {

  private List<Expression> expressions;

  public ExpressionGroup(List<Expression> expressions) {
    this.expressions = expressions;
  }

  @Override
  public Object eval(Row row) {
    return InternalRow.of(expressions.stream().map(e -> e.eval(row)).collect(Collectors.toList()));
  }

  @Override
  public List<Expression> children() {
    return expressions;
  }

  /**
   * get expression in index
   *
   * @param index where
   */
  public Expression get(int index) {
    return Optional.ofNullable(expressions).map(inner -> inner.get(index)).orElse(null);
  }

  /**
   * first expression
   */
  public Expression first() {
    return Optional.ofNullable(expressions).map(inner -> inner.get(0)).orElse(null);
  }

  /**
   * the size
   */
  public int size() {
    return Optional.ofNullable(expressions).map(innner -> innner.size()).orElse(0);
  }
}
