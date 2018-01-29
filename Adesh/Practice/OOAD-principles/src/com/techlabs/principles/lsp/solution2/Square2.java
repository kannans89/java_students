package com.techlabs.principles.lsp.solution2;

public class Square2 implements IPolygon{
	private int side;
	
	public Square2(int side){
		this.side = side;
	}

	public double calculateArea() {
		return (this.side * this.side);
	}

	@Override
	public String toString() {
		return "Area of Square = " + calculateArea();
	}
	
	
}
