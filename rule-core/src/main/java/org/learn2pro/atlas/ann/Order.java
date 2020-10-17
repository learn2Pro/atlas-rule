package org.learn2pro.atlas.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Order {

    /**
     * the priority order,the minimal would be execute first
     *
     * @return the order
     */
    int value() default 10;

}
