package joes;

import joes.service.sender.RabbitMQSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		RabbitMQSender bean = run.getBean(RabbitMQSender.class);
		bean.send();
	}
}
