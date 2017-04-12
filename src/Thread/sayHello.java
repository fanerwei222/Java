package Thread;

/**
 * Created by fanwei on 2017/3/29.
 */
public class sayHello implements Runnable {
    ThreadLocal<String> threadLocal = new ThreadLocal<String>();

    @Override
    public void run() {
        threadLocal.set("hello");
        threadLocal.set("say");
        threadLocal.set("   sb");

        System.out.println("我是一个实现Runnable的线程：" + Thread.currentThread().getName() + threadLocal.get());

    }
}
