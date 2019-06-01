package com.diplant.scheduledtasktest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.diplant.scheduledtasktest")
@EnableScheduling
public class TaskSchedulerConfig {

}
