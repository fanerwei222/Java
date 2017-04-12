package Thread;

/**
 * Created by fanwei on 2017/3/23.
 */
public class TwoThreadAlive extends Thread {
    public void run()
    {
        for (int i = 0; i < 10; i ++)
        {
            printMsg();
        }
    }

    public void printMsg()
    {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name=" + name);
    }

    public static void main(String[] args)
    {
        TwoThreadAlive twoThreadAlive = new TwoThreadAlive();
        twoThreadAlive.setName("Thread");
        System.out.println("before start(), tt.isAlive()=" + twoThreadAlive.isAlive());
        twoThreadAlive.start();
        System.out.println("just after start(), tt.isAlive()=" + twoThreadAlive.isAlive());

        for (int i = 0; i < 10; i++) {
            twoThreadAlive.printMsg();
        }
        System.out.println("The end of main(), tt.isAlive()=" + twoThreadAlive.isAlive());
    }
}
