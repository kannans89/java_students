package com.practice.patterns.creational.simple.factory.ex1.test;

import com.practice.patterns.creational.simple.factory.ex1.Shape;
import com.practice.patterns.creational.simple.factory.ex1.ShapeFactory;
import com.practice.patterns.creational.simple.factory.ex1.ShapeType;

public class TestShape {

	public static void main(String[] args) {
		Shape obj = new ShapeFactory().createShape(ShapeType.CIRCLE);
		obj.draw();
		System.out.println("hashcode = "+obj.hashCode());
	}

}
