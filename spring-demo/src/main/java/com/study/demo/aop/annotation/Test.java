package com.study.demo.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liukun
 * @description
 * @date 2020/4/4
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);
		TestBean testBean = (TestBean)applicationContext.getBean("testBean");
		testBean.test();
	}
}
