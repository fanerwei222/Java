package noOut;

import juTiJieKou.Pig;
import shiXian.DaYin;
import shiXian.DaYin2;
import shiXian.MyEat;
import shiXian.bigPig;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by fanwei on 2017/3/23.
 */
public class Play {
    public static void main(String[] args) throws Exception
    {
        DaYin daYin = new DaYin();
        DaYin2 daYin1 = new DaYin2("1");
        daYin1.print("123");
        daYin1.showPrint();
        System.out.println("这是个demo");
        Pig pig = new bigPig();
        pig.eat();
        pig.run();
        pig.sleep();
        juTiChouXiang.Pig pig1 = new juTiChouXiang.Pig();
        pig1.eat();
        pig1.sleep();
        MyEat myEat = new MyEat();
        myEat.eatMuch();
        daYin.print(" 简直了");
        System.out.println(" 简直了");
        daYin.print(getIp());
        daYin.print(getIpByName("www.baidu.com"));

    }

    /**
     * 获取本机ip地址
     */
    private static String getIp() throws Exception{
        InetAddress inetAddress = InetAddress.getLocalHost();
        String name = inetAddress.getHostName();
        String ip = inetAddress.getHostAddress();

        return "名称：" + name + "的ip地址"  + ip;
    }

    /**
     * 根据域名获取ip
     */
    private static String getIpByName(String name) throws Exception{
        InetAddress inetAddress = InetAddress.getByName(name);
        String hostName = inetAddress.getHostName();
        String hostIp = inetAddress.getHostAddress();

        return name + "的名称是:" + hostName + "的ip地址为:" + hostIp;
    }

    /**
     * 查看端口是否被占用
     * 报错、原因未知
     */
    public static void lookPortIsOcupy() throws IOException {
        Boolean isOcu = false;
        Socket socket ;
        String host = "localhost";
        for (int i = 0 ; i < 1024; i++)
        {
            System.out.println("查看 "+ i);
            socket = new Socket(host, i);
            System.out.println("端口 " + i + " 已被使用");
        }
    }
}
