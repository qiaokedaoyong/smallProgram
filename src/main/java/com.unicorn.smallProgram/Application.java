package com.unicorn.smallProgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 禁用springboot默认加载的单数据源配置
 * 开启事务管理
 * 开启定时任务
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement
@EnableScheduling
public class Application {
	public static void main(String[] args) throws Exception
    {
        SpringApplication.run(Application.class, args);
	}
}
