package org.learn2pro.atlas.expr.func.udf;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import org.learn2pro.atlas.ann.UDF;
import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.expr.math.BinaryArithmetic;
import org.learn2pro.atlas.model.Row;
import java.util.Map;
import org.apache.velocity.tools.generic.MathTool;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

public class UDFRegistry {

    protected static MathTool MATH_TOOL = new MathTool();
    private static Reflections REF = new Reflections("org.learn2pro.atlas.expr");
    private static Map<String, UDFRunner<?>> SUPPLIER = Maps.newHashMap();
    public static final Logger LOGGER = LoggerFactory.getLogger(BinaryArithmetic.class);

    static {
        REF.getTypesAnnotatedWith(UDF.class).forEach(klass -> {
            String[] symbol = klass.getAnnotation(UDF.class).value();
            try {
                for (String s : symbol) {
                    SUPPLIER.put(s, (UDFRunner<?>) klass.newInstance());
                }
            } catch (InstantiationException | IllegalAccessException e) {
                LOGGER.error("instantiate the udf runner failed!");
            }
        });
    }

    /**
     * evaluate the udf, return the reactive mono
     */
    public static Mono<?> eval(String name, Row row, ExpressionGroup params) {
        Preconditions
                .checkArgument(SUPPLIER.containsKey(name), "udf registry must contain this [%s]", name);
        return SUPPLIER.get(name).eval(row, params);
    }

}
