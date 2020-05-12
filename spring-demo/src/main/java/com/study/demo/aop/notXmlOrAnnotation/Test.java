package com.study.demo.aop.notXmlOrAnnotation;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author liukun
 * @description
 * @date 2020/4/5
 */
public class Test {
	public static void test01() {
		// 前置增强
		// 1、实例化bean和增强
		Animal dog = new Dog();
		MyMethodBeforeAdvice advice = new MyMethodBeforeAdvice();

		// 2、创建ProxyFactory并设置代理目标和增强
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(dog);
		proxyFactory.addAdvice(advice);

		// 3、生成代理实例
		Animal proxyDog = (Animal) proxyFactory.getProxy();
		proxyDog.sayHello("二哈", 3);
	}

	public static void test02() {
		// 后置增强
		// 1、实例化bean和增强
		Animal dog = new Dog();
		MyAfterReturningAdvice advice = new MyAfterReturningAdvice();

		// 2、创建ProxyFactory并设置代理目标和增强
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(dog);
		proxyFactory.addAdvice(advice);

		// 3、生成代理实例
		Animal proxyDog = (Animal) proxyFactory.getProxy();
		proxyDog.sayHello("二哈", 3);
	}

	public static void test04() {
		// 环绕增强
		// 1、实例化bean和增强
		Animal dog = new Dog();
		MyMethodInterceptor advice = new MyMethodInterceptor();

		// 2、创建ProxyFactory并设置代理目标和增强
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(dog);
		proxyFactory.addAdvice(advice);

		// 3、生成代理实例
		Animal proxyDog = (Animal) proxyFactory.getProxy();
		proxyDog.sayHello("二哈", 3);
	}
	public static void main(String[] args) {
		Test.test01();
		Test.test02();
		Test.test04();
	}
}
