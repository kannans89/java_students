package com.techlabs.lsp.solution2;

public class Test {

	public static void main(String[] args) {

		IPolygon polygon;
		// polygon=new Rectangle(10,20);
		polygon = new Square(30);
		System.out.println(polygon.calculateArea());
	}

}
