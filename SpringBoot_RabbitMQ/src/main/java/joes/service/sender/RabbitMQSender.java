package joes.service.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by myijoes on 2018/7/16.
 */

@Component
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("queue","hello,rabbit~");
    }
}
