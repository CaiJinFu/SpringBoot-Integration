package cn.joes;

import cn.joes.service.QuartzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		QuartzService quartzService = context.getBean(QuartzService.class);
		try {
			quartzService.addSimpleJob("HelloJob", "jobName001","Group001",10,null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
