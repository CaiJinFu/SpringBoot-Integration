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
 * 使用@Aspect注解将一个java类定义为切面类
 * 使用@Pointcut定义一个切入点，可以是一个规则表达式。
 *
 * 根据需要在切入点不同位置的切入内容
 *   @Before 在切入点开始处切入内容
 *   @After 在切入点结尾处切入内容
 *   @AfterReturning 在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
 *   @Around 在切入点前后切入内容，并自己控制何时执行切入点自身的内容
 *   @AfterThrowing 用来处理当切入内容部分抛出异常之后的处理逻辑
 *
 *
 * 切点的执行顺序
 * - 在切入点前的操作，按order的值由小到大执行
 * - 在切入点后的操作，按order的值由大到小执行
 *
 * Created by myijoes on 18/6/14.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext cac = SpringApplication.run(Application.class,args);
    }
}
