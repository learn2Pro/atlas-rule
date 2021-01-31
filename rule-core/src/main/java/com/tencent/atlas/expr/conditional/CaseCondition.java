package com.tencent.atlas.expr.conditional;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.model.Row;
import java.util.ArrayList;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * the case when statement like:
 * <ul>
 *     <li>case when a>10 then 10 when a>100 then 100 else -1 end</li>
 * </ul>
 */
public class CaseCondition extends Expression<Object> {

    /**
     * the pre condition
     */
    private List<WhenThen> conditions;
    /**
     * the else output, maybe null
     */
    private Expression<?> elseExpr;

    public CaseCondition(List<WhenThen> conditions) {
        this.conditions = conditions;
    }

    public CaseCondition(List<WhenThen> conditions, Expression<?> elseExpr) {
        this.conditions = conditions;
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
        Mono root = Mono.empty();
        for (WhenThen whenThen : conditions) {
            root = root.switchIfEmpty(whenThen.eval(row));
        }
        if (elseExpr != null) {
            return root.switchIfEmpty(elseExpr.eval(row));
        }
        return root;
    }

    /**
     * @return the symbol of expression
     */
    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append("CASE ");
        for (WhenThen condition : conditions) {
            sb.append(condition.symbol());
            sb.append('\n');
        }
        if (elseExpr != null) {
            sb.append(elseExpr.symbol());
        }
        sb.append(" END");
        return sb.toString();
    }

    /**
     * the children instance
     *
     * @return the children
     */
    @Override
    public List<Expression> children() {
        List<Expression> epxrs = new ArrayList<>(conditions);
        epxrs.add(elseExpr);
        return epxrs;
    }
}
