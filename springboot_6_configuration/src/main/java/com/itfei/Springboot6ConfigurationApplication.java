package com.itfei;

import com.alibaba.druid.pool.DruidDataSource;
import com.itfei.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot6ConfigurationApplication {
@Bean
@ConfigurationProperties(prefix = "datasource")
public DruidDataSource dataSource(){
    DruidDataSource ds=new DruidDataSource();
    //ds.setDriverClassName("sss");
    return ds;
}
    public static void main(String[] args)
    {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot6ConfigurationApplication.class, args);
        ServerConfig bean = run.getBean(ServerConfig.class);
        System.out.println(bean);
        DruidDataSource bean1 = run.getBean(DruidDataSource.class);
        System.out.println(bean1.getDriverClassName());
    }

}
