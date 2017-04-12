package Thread;

/**
 * Created by fanwei on 2017/3/29.
 */
public class sayHelloMain {
    public static void main(String[] args) {
        Thread say = new Thread(new sayHello());
        say.start();
        Thread hi = new sayHi();
        hi.start();
    }
}
