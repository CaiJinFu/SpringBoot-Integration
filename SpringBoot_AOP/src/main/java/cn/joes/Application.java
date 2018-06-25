package cn.joes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Spring Boot 应用启动类
 *
 * @EnableAsync AOP
 *
 * @EnableAspectJAutoProxy 开启aop (因为在springBoot的自动配置中开启了该注解  所以不需要在开启)
 *
 * Created by myijoes on 18/6/14.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext cac = SpringApplication.run(Application.class,args);
    }
}
