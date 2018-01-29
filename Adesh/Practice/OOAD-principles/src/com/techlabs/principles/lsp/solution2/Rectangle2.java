package com.techlabs.principles.lsp.solution2;

public class Rectangle2 implements IPolygon{
	private int width;
	private int height;
	
	public Rectangle2(int width, int height){
		this.width = width;
		this.height = height;
	}

	public double calculateArea() {
		return (this.width * this.height);
	}

	@Override
	public String toString() {
		return "Area of Rectangle2 = " + calculateArea();
	}
	
	
}
