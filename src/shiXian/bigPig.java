package shiXian;

import juTiJieKou.Pig;

/**
 * Created by fanwei on 2017/3/23.
 */
public class bigPig implements Pig {
    @Override
    public void eat() {
        System.out.println("猪实现了猪的接口在吃！");
    }

    @Override
    public void run() {
        System.out.println("猪实现了猪的接口在跑啊！");
    }

    @Override
    public void sleep() {
        System.out.println("猪实现了猪的接口在睡觉呀！");
    }
}
