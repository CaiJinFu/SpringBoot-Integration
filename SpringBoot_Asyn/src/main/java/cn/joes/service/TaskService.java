package cn.joes.service;

import cn.joes.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * Created by myijoes on 2018/6/25.
 */
@Service
public class TaskService {

    @Autowired
    Task task;

    /**
     *  异步
     */
    public void asyn() throws Exception {
        long start = System.currentTimeMillis();
        Future<String> task1 = task.fristTask();
        Future<String> task2 = task.secordTask();
        Future<String> task3 = task.lastTask();
        while (true){
            if (task1.isDone() && task2.isDone() && task3.isDone()){
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("异步执行时间，耗时：" + (end - start) + "毫秒");
    }
}
