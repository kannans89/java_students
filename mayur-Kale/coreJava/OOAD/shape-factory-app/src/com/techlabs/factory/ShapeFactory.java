package com.techlabs.factory;

public class ShapeFactory {

	public IShape make(ShapeType type) {

		if (type == ShapeType.SQUARE)
			return new Square();

		else if (type == ShapeType.RECTANGLE)
			return new Rectangle();

		else if (type == ShapeType.TRIANGLE)
			return new Triangle();
		return null;
	}
}
