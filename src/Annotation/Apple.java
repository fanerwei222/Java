package Annotation;

/**
 * Created by fanwei on 2017/3/29.
 * 水果注解使用
 */
public class Apple {
    @FruitName("Apple")
    private String appleName;
    @FruitColor(fruitColor = FruitColor.color.RED)
    private String appleColor;
    @FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
    private String appleProvider;

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
}
