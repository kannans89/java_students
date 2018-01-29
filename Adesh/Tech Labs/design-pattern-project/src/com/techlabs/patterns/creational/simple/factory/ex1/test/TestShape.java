package com.techlabs.patterns.creational.simple.factory.ex1.test;

import com.techlabs.patterns.creational.simple.factory.ex11.Shape;
import com.techlabs.patterns.creational.simple.factory.ex11.ShapeFactory;
import com.techlabs.patterns.creational.simple.factory.ex11.ShapeType;

public class TestShape {

	public static void main(String[] args) {
		Shape obj = new ShapeFactory().createShape(ShapeType.CIRCLE);
		obj.draw();
		System.out.println(obj);

	}
}
