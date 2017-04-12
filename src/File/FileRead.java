package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by fanwei on 2017/3/24.
 */
public class FileRead {
    public static void main(String[] args)
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("hello菜鸟.txt"));
            String str;
            while ((str = bufferedReader.readLine()) != null)
            {
                System.out.println(str);
            }
            System.out.println(str);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
