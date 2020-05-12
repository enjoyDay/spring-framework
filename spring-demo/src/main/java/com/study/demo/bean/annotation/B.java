package com.study.demo.bean.annotation;

import org.springframework.stereotype.Component;

/**
 * @author liukun
 * @description
 * @date 2020/3/9
 */
@Component
public class B {
	B() {
		System.out.println("construct B");
	}

	public void test() {
		System.out.println("test B");
	}
}
