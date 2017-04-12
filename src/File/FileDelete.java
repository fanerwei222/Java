package File;

import java.io.File;

/**
 * Created by fanwei on 2017/3/24.
 * (需要在 C 盘上先创建 test.txt 文件)
 */
public class FileDelete {
    public static void main(String[] args)
    {
        try{
            File file = new File("d:\\test.txt");
            if(file.delete()){
                System.out.println(file.getName() + " 文件已被删除！");
            }else{
                System.out.println("文件删除失败！");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
