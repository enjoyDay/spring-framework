package com.study.demo.aop.notXmlOrAnnotation;

/**
 * @author liukun
 * @description
 * @date 2020/4/5
 */
public class Dog implements Animal {
	@Override
	public void sayHello(String name, int age) {
		System.out.println("==名字：" + name + " 年龄：" + age);
	}

	@Override
	public void sayException(String name, int age) {
		System.out.println("==名字：" + name + " 年龄：" + age);
		System.out.println("==抛出异常：");
	}
}
