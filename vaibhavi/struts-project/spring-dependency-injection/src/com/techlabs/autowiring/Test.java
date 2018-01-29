package com.techlabs.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.shapes.ShapeFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app;
		app=new ClassPathXmlApplicationContext("beantriangle.xml");
		Triangle triangle=app.getBean("triangle",  Triangle.class);
		triangle.draw();
	}

}
