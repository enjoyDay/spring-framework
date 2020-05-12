package com.study.demo.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @author liukun
 * @description 被代理类
 * @date 2020/4/4
 */
@Component
public class TestBean {
	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test() {
		System.out.println("test");
	}
}
