package com.study.demo.bean;

import com.study.demo.bean.annotation.AppConfig;
import com.study.demo.bean.annotation.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liukun
 * @description
 * @date 2020/3/9
 */
@SuppressWarnings("deprecation")
public class Test {
	public static void main(String[] args) {
		// 注解
		ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		B bean = annotationConfigApplicationContext.getBean(B.class);
		bean.test();

		// XML配置文件
//		BeanFactory bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
//		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
//		String testStr = myTestBean.getTestStr();
//		System.out.println(testStr);
	}
}
