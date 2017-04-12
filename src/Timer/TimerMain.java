package Timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by fanwei on 2017/4/12.
 * timer类小栗子
 */
public class TimerMain {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTask(), 1000, 2000);
    }
}

/**
 * 自定义任务类
 */
class MyTask extends TimerTask
{
    int i = 0;
    @Override
    public void run() {
        i ++ ;
        System.out.println("第" + i + "次");
        while (i == 10)
        {
            this.cancel();
        }
    }
}
