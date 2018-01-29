package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Circle;

public class RectangleTest {

	public static void main(String[] args) {
		Circle circle = new Circle(10, 10, 10);
		System.out.println("Area of rectangle is " + circle.calcRectArea()
				+ " Area of circle is " + circle.calcCircleArea());

	}

}
