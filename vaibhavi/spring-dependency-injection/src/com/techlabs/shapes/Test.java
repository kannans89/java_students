package com.techlabs.shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app;
		app=new ClassPathXmlApplicationContext("bean.xml");
		//IShape shape=ShapeFactory.getShapes(Shapes.RECTANGLE);
		
		ShapeFactory factory=app.getBean("factory",  ShapeFactory.class);
		IShape shape=factory.getShapes(Shapes.CIRCLE);
		shape.draw();
		
	
		//IShape shape2=app.getBean("circle", IShape.class);
		

	}

}
