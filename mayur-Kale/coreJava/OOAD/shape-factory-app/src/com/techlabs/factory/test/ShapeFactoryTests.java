package com.techlabs.factory.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.factory.IShape;
import com.techlabs.factory.ShapeFactory;
import com.techlabs.factory.ShapeType;
import com.techlabs.factory.Square;

public class ShapeFactoryTests {

	@Test
	public void ShapeFactoryMake() {

		// Arrange
		ShapeFactory factory = new ShapeFactory();
//		String exceptedResult = "Square";

		// Act
		IShape shape = factory.make(ShapeType.SQUARE);
//		String actualResult = shape.getClass().getSimpleName();

		// Assert
		assertEquals(Square.class, shape.getClass());
	}

}
