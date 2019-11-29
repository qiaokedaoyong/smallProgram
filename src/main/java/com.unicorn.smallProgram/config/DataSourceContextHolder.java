package com.unicorn.smallProgram.config;

/**
 * 保存一个线程安全的数据源容器
 */
public class DataSourceContextHolder {

	private static final ThreadLocal<DataSourceType> contextHolder = new ThreadLocal<>();

	public static final DataSourceType DEFAULT_DS = DataSourceType.mysqlDS; //默认数据源

	static {
		contextHolder.set(DEFAULT_DS);
	}

	public static void setDB(DataSourceType dataBaseType) {
		contextHolder.set(dataBaseType);
	}

	public static DataSourceType getDB() {
		return contextHolder.get();
	}

	public static void clearDB() {
		contextHolder.remove();
	}
}
