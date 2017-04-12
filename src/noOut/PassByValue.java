package noOut;

/**
 * Created by fanwei on 2017/3/29.
 */
public class PassByValue {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        getString(sb);
        System.out.println(sb);
    }

    public static void getString(StringBuffer s)
    {
        s = new StringBuffer("ha");
        s.append("world");
    }
}
