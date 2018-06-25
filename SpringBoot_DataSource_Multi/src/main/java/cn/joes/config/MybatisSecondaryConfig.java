package cn.joes.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by myijoes on 2018/6/23.
 */

@Configuration
@MapperScan(basePackages = "classpath:mapper/secondary/*.xml")
public class MybatisSecondaryConfig {


}
