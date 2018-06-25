package cn.joes.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * Created by myijoes on 2018/6/25.
 */

@Component
public class Task {

    public static Random random =new Random();

    /**
     * 任务一
     */
    @Async
    public Future<String> fristTask() throws Exception {
        System.out.println("开始:任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<String>("任务一完成");
    }

    /**
     * 任务二
     */
    @Async
    public Future<String> secordTask() throws Exception {
        System.out.println("开始:任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<String>("任务二完成");
    }

    /**
     * 任务三
     */
    @Async
    public Future<String> lastTask() throws Exception {
        System.out.println("开始:任务三");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<String>("任务三完成");
    }

}
