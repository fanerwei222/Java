package juTiChouXiang;

import chouXiang.Animals;

/**
 * Created by fanwei on 2017/3/23.
 */
public class Pig extends Animals{
    @Override
    public void eat() {
        System.out.println("猪的抽象类实现了吃");
    }

    @Override
    public void sleep() {
        System.out.println("猪的抽象类实现了睡觉");
    }
}
