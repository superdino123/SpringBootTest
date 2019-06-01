package com.diplant.aoptest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.diplant.aoptest")
@EnableAspectJAutoProxy
public class AopConfig {

}
