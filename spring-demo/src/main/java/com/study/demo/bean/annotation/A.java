package com.study.demo.bean.annotation;

import org.springframework.stereotype.Component;

/**
 * @author liukun
 * @description
 * @date 2020/3/9
 */
@Component
public class A {
	A() {
		System.out.println("construct A");
	}

	public void test() {
		System.out.println("test A");
	}
}
