package com.techlabs.shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeFactory {
	
	public static IShape getShapes(Shapes type)
	{
		IShape shape=null;
	   if(type==Shapes.CIRCLE)
	   {
		   shape=new Circle();
	   }
	   if(type==Shapes.RECTANGLE)
	   {
		   shape=new Rectangle();
	   }
	   
	 if(type==Shapes.TRIANGLE)
	 {
		 shape=new Triangle();
	 }
		
	 return shape;
	  }

}
