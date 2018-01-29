package com.techlabs.shape.test;

import com.techlabs.shape.IShape;
import com.techlabs.shape.ShapeFactory;

public class ShapeFactorySpringTest {

	public static void main(String[] args) {

		IShape shape = ShapeFactory.getShape("rectangle");
		shape.draw();
		shape = ShapeFactory.getShape("triangle");
		shape.draw();
		shape = ShapeFactory.getShape("circle");
		shape.draw();
	}

}
