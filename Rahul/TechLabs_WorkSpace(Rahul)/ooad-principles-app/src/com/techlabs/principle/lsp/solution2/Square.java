package com.techlabs.principle.lsp.solution2;

public class Square implements IPolygon {
	// Instance Variables

	private int side;

	// constructor
	public Square(int squareSide) {
		side = squareSide;
	}

	// Methods
	@Override
	public int calculateArea() {
		System.out.println("Area of Square :");
		return side * side;
	}

}
