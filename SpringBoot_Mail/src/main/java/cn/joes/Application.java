package cn.joes;

import cn.joes.service.MailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.mail.MessagingException;
import java.io.FileNotFoundException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws MessagingException, FileNotFoundException {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        MailService bean = run.getBean(MailService.class);
        bean.sendMail();
        bean.sendMailDetail();
        bean.sendMailDetail1();
        bean.sendMailDetailWithTemplate();
    }
}
