package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by fanwei on 2017/3/24.
 */
public class FileWrite {
    public static void main(String[] args)
    {
        try {
            String name = "hello菜鸟.txt";
            String content = "hello 你就是菜鸟";
            FileWriter fileWrite = new FileWriter(name);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
            bufferedWriter.write(content);
            bufferedWriter.close();

            System.out.println("文件创建成功！" );
        }catch (IOException e)
        {

        }
    }
}
