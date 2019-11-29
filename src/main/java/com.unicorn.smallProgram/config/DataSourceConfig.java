package com.unicorn.smallProgram.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据源配置
 * es 是自动加载
 */
@Configuration
public class DataSourceConfig {

	@Autowired
	private Environment env;

	@Bean(name = "dataSource1")
	public DruidDataSource dataSource1(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.mysql.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.mysql.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.mysql.password"));
		dataSource.setDriverClassName(env.getProperty("spring.datasource.mysql.driver-class-name"));
		dataSource.setInitialSize(env.getProperty("spring.datasource.mysql.initial-size",Integer.class));
		dataSource.setMaxActive(env.getProperty("spring.datasource.mysql.max-active",Integer.class));
		dataSource.setMinIdle(env.getProperty("spring.datasource.mysql.min-idle",Integer.class));
		dataSource.setMaxWait(env.getProperty("spring.datasource.mysql.max-wait",Long.class));
		dataSource.setPoolPreparedStatements(env.getProperty("spring.datasource.mysql.pool-prepared-statements",boolean.class));
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(env.getProperty("spring.datasource.mysql.max-pool-prepared-statement-per-connection-size",Integer.class));
		dataSource.setValidationQuery(env.getProperty("spring.datasource.mysql.validation-query"));
		dataSource.setValidationQueryTimeout(env.getProperty("spring.datasource.mysql.validation-query-timeout",Integer.class));
		dataSource.setTestWhileIdle(env.getProperty("spring.datasource.mysql.testWhileIdle", boolean.class));
		return dataSource;
	}

	@Bean(name = "dataSource2")
	public DruidDataSource dataSource2(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.mysql2.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.mysql2.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.mysql2.password"));
		dataSource.setDriverClassName(env.getProperty("spring.datasource.mysql2.driver-class-name"));
		dataSource.setInitialSize(env.getProperty("spring.datasource.mysql2.initial-size",Integer.class));
		dataSource.setMaxActive(env.getProperty("spring.datasource.mysql2.max-active",Integer.class));
		dataSource.setMinIdle(env.getProperty("spring.datasource.mysql2.min-idle",Integer.class));
		dataSource.setMaxWait(env.getProperty("spring.datasource.mysql2.max-wait",Long.class));
		dataSource.setPoolPreparedStatements(env.getProperty("spring.datasource.mysql2.pool-prepared-statements",boolean.class));
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(env.getProperty("spring.datasource.mysql2.max-pool-prepared-statement-per-connection-size",Integer.class));
		dataSource.setValidationQuery(env.getProperty("spring.datasource.mysql2.validation-query"));
		dataSource.setValidationQueryTimeout(env.getProperty("spring.datasource.mysql2.validation-query-timeout",Integer.class));
		dataSource.setTestWhileIdle(env.getProperty("spring.datasource.mysql2.testWhileIdle", boolean.class));
		return dataSource;
	}


	/**
	 * 动态数据源，通过AOP实现切换
	 * @return
	 */
	@Bean(name = "dynamicDataSource")
	@Primary
	public DynamicDataSource dynamicDataSource() {
		DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //默认数据源，impala
        dynamicDataSource.setDefaultTargetDataSource(dataSource2());
		//配置多数据源
		Map<Object, Object> map = new HashMap<>();
		map.put(DataSourceType.mysqlDS,dataSource1());
		map.put(DataSourceType.mysqlDS2,dataSource2());
		dynamicDataSource.setTargetDataSources(map);
		return dynamicDataSource;
	}

	/**
	 * 配置事务管理器
	 * @return
	 */
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dynamicDataSource());
	}

}
