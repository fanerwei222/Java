package noOut;

import juTiChouXiang.PrintLogImpl;

/**
 * Created by fanwei on 2017/3/28.
 */
public class PrintLog {
    private static jieKou.PrintLog printLog = new PrintLogImpl();

    public static void main(String[] args) {
        printLog.printLog();
        System.out.println("123");
    }
}
