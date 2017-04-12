package noOut;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * Created by fanwei on 2017/3/23.
 */
public class GetUrlInfo {
    public static void main(String[] args) throws Exception
    {
        URL url = new URL("http://www.ulyne.com");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();


        System.out.println("URL 是 " + url.toString());
        System.out.println("协议是 " + url.getProtocol());
        System.out.println("文件名是 " + url.getFile());
        System.out.println("主机是 " + url.getHost());
        System.out.println("路径是 " + url.getPath());
        System.out.println("端口号是 " + url.getPort());
        System.out.println("默认端口号是 "
                + url.getDefaultPort());
        Map headers = httpURLConnection.getHeaderFields();
        Set<String> keys = headers.keySet();
        for( String key : keys ){
            String val = httpURLConnection.getHeaderField(key);
            System.out.println(key+"    "+val);
        }
        System.out.println( httpURLConnection.getLastModified() );
        long date = httpURLConnection.getDate();
        if (date == 0)
        {
            System.out.println("无法获取信息。");
        }else
        {
            System.out.println("Date: " + new Date(date));
        }
    }
}
