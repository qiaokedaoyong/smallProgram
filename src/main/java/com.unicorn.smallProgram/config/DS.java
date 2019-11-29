package com.unicorn.smallProgram.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 自定义注解
 */
@Retention(RetentionPolicy.RUNTIME) //生命周期 运行时
@Target({ElementType.METHOD}) //作用范围 方法
public @interface DS {
	DataSourceType value() default DataSourceType.mysqlDS;
}
