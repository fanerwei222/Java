package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fanwei on 2017/3/28.
 */
public class RegexMatches {
    public static void main(String[] args) {
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("No Match");
        }
    }

    /**
     * Email
     */
    public void emailRegex()
    {
        String str = "fanwei@163.com";
        String regex = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\\\.){1,3}[a-zA-z\\\\-]{1,}";
    }
}
