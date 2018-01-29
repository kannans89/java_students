package com.techlabs.principles.lsp.solution2;

public class Rectangle implements IPolygon {
	private int height;
	private int width;

	public Rectangle(int h, int w) {
		height = h;
		width = w;
	}

	public int calculateArea() {
		return (width * height);
	}

	@Override
	public String toString() {
		return "Area of Rectangle is = "+calculateArea();
	}

}
