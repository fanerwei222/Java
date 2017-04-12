package Thread;

/**
 * Created by fanwei on 2017/3/29.
 */
public class sayHi extends Thread {
    ThreadLocal threadLocal = new ThreadLocal();
    
    @Override
    public void run() {
        threadLocal.set("hello");
        threadLocal.set("   hi");

        System.out.println("我是一个Thread创建的线程：" + Thread.currentThread().getName() + threadLocal.get());
    }
}
