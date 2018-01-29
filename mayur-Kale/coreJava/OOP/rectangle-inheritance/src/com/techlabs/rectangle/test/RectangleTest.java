package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Circle;

public class RectangleTest {

	public static void main(String[] argsStrings) {
		Circle c = new Circle();
		c.setHeight(10);
		c.setRadius(10);
		c.setWidth(10);
		System.out.println("Area of Rectangle is " + c.getRectArea()
				+ " and Area of Circle is " + c.getCircleArea());

	}
}
