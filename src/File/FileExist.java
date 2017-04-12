package File;

import java.io.File;

/**
 * Created by fanwei on 2017/3/28.
 */
public class FileExist {
    public static void main(String[] args)
    {
        File hello = new File("hello菜鸟.txt");
        boolean is = hello.exists();
        System.out.println(is);
    }
}
