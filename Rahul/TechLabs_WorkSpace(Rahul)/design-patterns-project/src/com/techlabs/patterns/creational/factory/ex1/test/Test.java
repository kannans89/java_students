package com.techlabs.patterns.creational.factory.ex1.test;

import com.techlabs.patterns.creational.factory.ex1.Shape;
import com.techlabs.patterns.creational.factory.ex1.ShapeFactory;
import com.techlabs.patterns.creational.factory.ex1.ShapeType;

public class Test {

	public static void main(String[] args) {
		Shape shapeObject = ShapeFactory.createShape(ShapeType.RECTANGLE);
		shapeObject.draw();
		System.out.println(shapeObject);
	}

}
