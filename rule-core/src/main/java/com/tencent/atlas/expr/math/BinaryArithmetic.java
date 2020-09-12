package com.tencent.atlas.expr.math;

import com.google.common.collect.Maps;
import com.tencent.atlas.ann.MathOp;
import com.tencent.atlas.expr.Expression;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.apache.velocity.tools.generic.MathTool;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BinaryArithmetic extends Arithmetic {

    protected static MathTool MATH_TOOL = new MathTool();
    private static Reflections REF = new Reflections("com.tencent.atlas.expr");
    private static Map<String, Class<?>> SUPPLIER = Maps.newHashMap();
    public static final Logger LOGGER = LoggerFactory.getLogger(BinaryArithmetic.class);

    static {
        REF.getTypesAnnotatedWith(MathOp.class).forEach(klass -> {
            String symbol = klass.getAnnotation(MathOp.class).value();
            SUPPLIER.put(symbol, klass);
        });
    }

    /**
     * the left expression
     */
    public abstract Expression left();

    /**
     * the right expression
     */
    public abstract Expression right();

    /**
     * create by math operator symbol
     */
    public static Arithmetic create(String symbol, Expression left, Expression right) {
        if (!SUPPLIER.containsKey(symbol)) {
            throw new UnsupportedOperationException("not found the match [" + symbol + "] expression!");
        }
        try {
            Constructor<?> ctor = SUPPLIER.get(symbol)
                    .getConstructor(Expression.class, Expression.class);
            return (Arithmetic) ctor.newInstance(left, right);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            LOGGER.error("instantiate operator failed,pls check!", e);
            return null;
        }
    }

}
