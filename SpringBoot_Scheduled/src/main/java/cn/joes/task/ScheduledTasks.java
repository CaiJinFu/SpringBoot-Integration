package cn.joes.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by myijoes on 2018/6/23.
 */

@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private static int a = 0;

    @Scheduled(fixedRate = 60000)
    public void reportCurrentTime() throws IOException {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 16 17 ? * *")
    public void appointTimeTask() {
        System.out.println("指定时间的定时时间为：" + dateFormat.format(new Date()));
    }
}
