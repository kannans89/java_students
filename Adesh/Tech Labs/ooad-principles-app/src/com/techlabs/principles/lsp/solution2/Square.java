package com.techlabs.principles.lsp.solution2;

public class Square implements IPolygon{
	private int side;
	
	public Square(int side){
		this.side = side;
	}

	public int calculateArea() {
		return (this.side * this.side);
	}

	@Override
	public String toString() {
		return "Area of Square is = " + calculateArea();
	}

}
