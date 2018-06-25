package cn.joes;

import cn.joes.service.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Spring Boot 应用启动类
 *
 * @EnableAsync 开启异步
 *
 * Created by myijoes on 18/6/14.
 */
@SpringBootApplication
@EnableAsync
public class Application {

    public static void main(String[] args) throws Exception {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件

        ConfigurableApplicationContext cac = SpringApplication.run(Application.class,args);
        TaskService taskService = cac.getBean(TaskService.class);
        taskService.asyn();
    }
}
