package Annotation;

import java.lang.reflect.Field;

/**
 * Created by fanwei on 2017/4/12.
 * 水果注解处理器
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz)
    {
        String fruitName = "水果名称";
        String fruitColor = "水果颜色";
        String fruitProvider = "水果供应商";

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields)
        {
            if (field.isAnnotationPresent(FruitName.class))
            {
                FruitName fruitName1 = field.getAnnotation(FruitName.class);
                fruitName = fruitName + fruitName1.value();
                System.out.println(fruitName);
            }
            else if(field.isAnnotationPresent(FruitColor.class))
            {
                FruitColor fruitColor1= (FruitColor) field.getAnnotation(FruitColor.class);
                fruitColor = fruitColor + fruitColor1.fruitColor().toString();
                System.out.println(fruitColor);
            }
            else if(field.isAnnotationPresent(FruitProvider.class))
            {
                FruitProvider fruitProvider1= (FruitProvider) field.getAnnotation(FruitProvider.class);
                fruitProvider=" 供应商编号："+fruitProvider1.id()+" 供应商名称："+fruitProvider1.name()+" 供应商地址："+fruitProvider1.address();
                System.out.println(fruitProvider);
            }
        }
    }
}
