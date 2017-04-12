package juTiJieKou;

import jieKou.Animals;

/**
 * Created by fanwei on 2017/3/23.
 */
public interface Pig extends Animals {
    @Override
    void eat();

    @Override
    void run();

    @Override
    void sleep();
}
