package com.study.demo.aop.notXmlOrAnnotation;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author liukun
 * @description 自定义前置增强
 * @date 2020/4/5
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("==前置增强");
		System.out.println("==方法名：" + method.getName());
		if (null != args && args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println("==第" + (i + 1) + "参数：" + args[i]);
			}
		}
		System.out.println("==目标类信息：" + target.toString());
	}
}
