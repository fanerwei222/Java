package Annotation;

import java.lang.annotation.*;

/**
 * Created by fanwei on 2017/3/29.
 * 水果供应者注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    public int id() default -1;
    public String name() default "";
    public String address() default "";
}
