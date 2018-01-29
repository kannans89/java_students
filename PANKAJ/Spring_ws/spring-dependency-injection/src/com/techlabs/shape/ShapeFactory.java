package com.techlabs.shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeFactory {
	
	public static IShape getShape(String shape) {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		return (IShape) app.getBean(shape);
	}
}
