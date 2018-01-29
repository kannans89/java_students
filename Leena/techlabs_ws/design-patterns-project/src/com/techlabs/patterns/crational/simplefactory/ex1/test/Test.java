package com.techlabs.patterns.crational.simplefactory.ex1.test;
import com.techlabs.patterns.crational.simplefactory.ex1.Shape;
import com.techlabs.patterns.crational.simplefactory.ex1.ShapeFactory;
import com.techlabs.patterns.crational.simplefactory.ex1.ShapeType;

public class Test {

	public static void main(String[] args) {
		
		Shape shapeObj=new ShapeFactory().createShape(ShapeType.CIRCLE);
		shapeObj.draw();
		System.out.println(shapeObj);
		System.out.println("---------------------------------------------");
		Shape shapeObj1=new ShapeFactory().createShape(ShapeType.RECTANGLE);
		shapeObj1.draw();
		System.out.println(shapeObj1);
	}

}
