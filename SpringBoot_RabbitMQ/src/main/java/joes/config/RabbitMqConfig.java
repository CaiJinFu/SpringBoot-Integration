package joes.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by myijoes on 2018/7/16.
 */

@Configuration
public class RabbitMqConfig {

    /**
     * 创建RabbitMQ队列
     *
     * @return
     */
    @Bean
    public Queue queue() {
        return new Queue("queue");
    }



}
