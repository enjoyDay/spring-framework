package com.study.demo.aop.notXmlOrAnnotation;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author liukun
 * @description 环绕增强
 * @date 2020/4/5
 */
public class MyMethodInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("==环绕增强开始");
		System.out.println("==方法名：" + invocation.getMethod().getName());
		Object[] args = invocation.getArguments();
		if (null != args && args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println("==第" + (i + 1) + "参数：" + args[i]);
			}
		}

		Object proceed = invocation.proceed();

		System.out.println("==环绕增强结束");
		return proceed;
	}
}
