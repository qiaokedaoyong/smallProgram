package com.unicorn.smallProgram.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * 定时任务线程池
 */
@Configuration
public class ScheduleConfig  {

    @Value("${scheduleThreadPoll.corePoolSize}")
    private int corePoolSize;

    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        ExecutorService executor = new ScheduledThreadPoolExecutor(corePoolSize);
        return executor;
    }
}
