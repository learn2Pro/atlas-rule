package com.tencent.atlas.expr.logic;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.ExpressionGroup;
import com.tencent.atlas.expr.Predicate;
import com.tencent.atlas.feature.com.google.common.collect.Lists;
import com.tencent.atlas.feature.com.google.common.collect.Sets;
import com.tencent.atlas.model.Row;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class InPredicate extends Predicate {

    /**
     * the left expression
     */
    private Expression left;
    /**
     * is in or not in
     */
    private boolean isOrNot;
    /**
     * the in list
     */
    private ExpressionGroup inList;
    /**
     * the items to compare
     */
    private final Set<String> items = Sets.newHashSet();

    public InPredicate(Expression left, ExpressionGroup inList) {
        this.left = left;
        this.isOrNot = true;
        this.inList = inList;
        saturateItems(this.inList);
    }

    public InPredicate(Expression left, boolean isOrNot, ExpressionGroup inList) {
        this.left = left;
        this.isOrNot = isOrNot;
        this.inList = inList;
        saturateItems(this.inList);
    }

    /**
     * generate bool answer
     *
     * @param row
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public Mono<Boolean> eval(Row row) {
        return (Mono<Boolean>) left.eval(row).map(cmp -> {
            return isOrNot == items.contains(String.valueOf(cmp));
        });
    }

    /**
     * @return the symbol of expression
     */
    @Override
    public String symbol() {
        StringBuilder sb = new StringBuilder();
        sb.append(left.symbol());
        sb.append(' ');
        if (!isOrNot) {
            sb.append("NOT ");
        }
        sb.append("IN (");
        for (Expression child : inList.children()) {
            sb.append(child.symbol());
            sb.append(",");
        }
        sb.append(")");
        return sb.toString();
    }

    /**
     * the children instance
     *
     * @return the children
     */
    @Override
    public List<Expression> children() {
        List<Expression> lst = Lists.newArrayList(left);
        lst.addAll(inList.children());
        return lst;
    }

    @SuppressWarnings("unchecked")
    private void saturateItems(ExpressionGroup inList) {
        Flux.fromIterable(inList.children()).flatMap(e -> {
            return (Mono<Object>) e.eval(null);
        }).map(String::valueOf).collect(() -> items, Set::add).block(Duration.ofMillis(200));
    }
}
