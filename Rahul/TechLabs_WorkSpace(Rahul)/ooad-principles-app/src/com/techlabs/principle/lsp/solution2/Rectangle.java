package com.techlabs.principle.lsp.solution2;

public class Rectangle implements IPolygon {
	// Instance Variables
	private int width;
	private int height;

	// constructor
	public Rectangle(int rectangleWidth, int rectangleHeight) {
		width = rectangleWidth;
		height = rectangleHeight;
	}

	@Override
	public int calculateArea() {
		System.out.println("Area of Rectangle :");
		return width * height;
	}

}
