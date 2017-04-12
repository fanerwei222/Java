package noOut;

import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by fanwei on 2017/3/23.
 */
public class WebPing {
    public static void main(String[] args)
    {
        try {
            InetAddress addr;
            Socket sock = new Socket("www.runoob.com", 80);
            addr = sock.getInetAddress();
            System.out.println("连接到 " + addr);
            System.out.println("连接到成功了我关闭了哦 ");
            sock.close();
        } catch (java.io.IOException e) {
            System.out.println("无法连接 " + args[0]);
            System.out.println(e);
        }
    }
}
