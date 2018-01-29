package com.techlabs.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleFactory {
	
	public static Triangle getTriangle() {
		ApplicationContext app = new ClassPathXmlApplicationContext("beanTriangle.xml");
		return app.getBean("triangle",Triangle.class);
	}
}
