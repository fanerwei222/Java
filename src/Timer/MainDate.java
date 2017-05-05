package Timer;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by fanwei on 2017/4/21.
 */
public class MainDate {
    public static void main(String[] args) {
        Date date  = new Date();//获取当前时间 ;
        Calendar calendar   =   new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
        Date dateStart=calendar.getTime();   //这个时间就是日期往后推一天的结果
        calendar.add(calendar.DATE,2);
        Date dateEnd = calendar.getTime();
        System.out.println("------------------");
        System.out.println(dateStart);
        System.out.println(dateEnd);
        System.out.println("------------------");
        //System.out.println(date);
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String dateString1 = format1.format(dateStart);
        String dateString2 = format1.format(dateEnd);
        System.out.println(dateString1);
        System.out.println(dateString2);
        try{
            date = format1.parse(dateString1);
            date = format1.parse(dateString2);
        }catch(Exception e){

        }
        //System.out.println(date);





        Calendar cal=Calendar.getInstance();//使用日历类
        int year=cal.get(Calendar.YEAR);//得到年
        int month=cal.get(Calendar.MONTH)+1;//得到月，因为从0开始的，所以要加1
        int day=cal.get(Calendar.DAY_OF_MONTH);//得到天
        int hour=cal.get(Calendar.HOUR);//得到小时
        int minute=cal.get(Calendar.MINUTE);//得到分钟
        int second=cal.get(Calendar.SECOND);//得到秒
        
//        System.out.println(getNextDay(new Date()));
    }

    public static Date getNextDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        //date = calendar.getTime();
        int year=calendar.get(Calendar.YEAR);//得到年
        int month=calendar.get(Calendar.MONTH);//得到月，因为从0开始的，所以要加1
        int day=calendar.get(Calendar.DAY_OF_MONTH);//得到天
        date = new Date(year,  month,  day);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        return date;
    }


}
