package com.unicorn.smallProgram.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	private Logger logger = LoggerFactory.getLogger(DynamicDataSource.class);

	@Override
	protected Object determineCurrentLookupKey() {
//		logger.info("dataSource={}",DataSourceContextHolder.getDB());
		return DataSourceContextHolder.getDB();
	}
}
