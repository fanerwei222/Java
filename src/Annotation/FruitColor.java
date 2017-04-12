package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by fanwei on 2017/3/29.
 * 水果颜色注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
    public enum color{BLUE, RED, GREEN};

    color fruitColor() default color.GREEN;
}
