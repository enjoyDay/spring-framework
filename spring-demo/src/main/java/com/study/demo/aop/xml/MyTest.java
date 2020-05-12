package com.study.demo.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liukun
 * @description
 * @date 2020/4/5
 */
public class MyTest {
	public static void test1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopTest.xml");
		Cat cat = ctx.getBean("cat", Cat.class);
		cat.sayHello("美美", 3);
	}

	public static void test2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopTest.xml");
		Cat cat = ctx.getBean("cat", Cat.class);
		cat.sayException("美美", 3);
	}

	/**
	 * 引入增强
	 */
	public static void test3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopTest.xml");
		IIntroduce introduce = ctx.getBean("cat", IIntroduce.class);
		introduce.sayIntroduce();
	}


	public static void main(String[] args) {
		MyTest.test1();

		MyTest.test2();

		MyTest.test3();
	}
}
