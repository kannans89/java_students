package com.techlabs.lsp.solution2;

public class Rectangle implements IPolygon {

	private int height;
	private int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;

	}

	@Override
	public int calculateArea() {

		return height * width;
	}

}
