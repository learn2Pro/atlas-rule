package com.tencent.atlas.expr.conditional;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.Predicate;
import com.tencent.atlas.feature.com.google.common.collect.ImmutableList;
import com.tencent.atlas.model.Row;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * the if else statement like:
 * <ul>
 *     <li>if a>10 then 10 else 1 end if</li>
 * </ul>
 */
public class IfElse extends Expression<Object> {

    /**
     * the if condition
     */
    private Predicate predicate;
    /**
     * the output when if is true
     */
    private Expression consequence;
    /**
     * the output when if is false, could be empty
     */
    private Expression elseExpr;

    public IfElse(Predicate predicate, Expression consequence) {
        this.predicate = predicate;
        this.consequence = consequence;
    }

    /**
     * the if else constructor
     * @param predicate the predicate
     * @param consequence the output
     * @param elseExpr the else expr
     */
    public IfElse(Predicate predicate, Expression consequence, Expression elseExpr) {
        this.predicate = predicate;
        this.consequence = consequence;
        this.elseExpr = elseExpr;
    }

    /**
     * evaluate the expression
     *
     * @param row input
     * @return after eval
     */
    @Override
    @SuppressWarnings("unchecked")
    public Mono<Object> eval(Row row) {
        return predicate.eval(row).flatMap(ans -> {
            if (ans) {
                return consequence.eval(row);
            } else if (elseExpr != null) {
                return elseExpr.eval(row);
            } else {
                return Mono.empty();
            }
        });
    }

    /**
     * @return the symbol of expression
     */
    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append("IF ");
        sb.append(predicate.symbol());
        sb.append(" THEN ");
        sb.append(consequence.symbol());
        if (elseExpr != null) {
            sb.append(" ELSE ");
            sb.append(elseExpr.symbol());
        }
        sb.append(" END IF");
        return sb.toString();
    }

    /**
     * the children instance
     *
     * @return the children
     */
    @Override
    public List<Expression> children() {
        if (elseExpr == null) {
            return ImmutableList.of(predicate, consequence);
        } else {
            return ImmutableList.of(predicate, consequence, elseExpr);
        }
    }

}
