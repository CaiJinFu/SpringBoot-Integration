package joes.service.receive;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by myijoes on 2018/7/16.
 */
@Component
public class RabbitMQReceive {

    @RabbitListener(queues = "queue")    //监听器监听指定的Queue
    public void reveive(String str) {
        System.out.println("Receive:" + str);
    }

}
