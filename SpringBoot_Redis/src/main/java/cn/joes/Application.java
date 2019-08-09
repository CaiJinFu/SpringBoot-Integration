package cn.joes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Spring Boot 应用启动类
 *
 * @MapperScan 接口类扫描包配置
 *
 * Created by myijoes on 18/6/14.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        RedisTemplate redisTemplate = (RedisTemplate)run.getBean("redisTemplate");
        redisTemplate.opsForValue().set(1, 2);
        String s = redisTemplate.opsForValue().get("erp2:number:PRUR").toString();
        System.out.println("............." + s);
    }
}
