package com.study.demo.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author liukun
 * @description
 * @date 2020/4/4
 */
@Configuration
@ComponentScan("com.study.demo.aop.annotation")
@EnableAspectJAutoProxy
public class AOPConfig {
}
