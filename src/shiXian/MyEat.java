package shiXian;

import juTiJieKou.EatMuch;

/**
 * Created by fanwei on 2017/3/23.
 */
public class MyEat implements EatMuch {
    @Override
    public void eatLit() {
        System.out.println("我吃的少");
    }

    @Override
    public void eatSmall() {
        System.out.println("我吃的小");
    }

    @Override
    public void eatBig() {
        System.out.println("我吃的大");
    }

    @Override
    public void eatMuch() {
        System.out.println("我吃的多");
    }
}
