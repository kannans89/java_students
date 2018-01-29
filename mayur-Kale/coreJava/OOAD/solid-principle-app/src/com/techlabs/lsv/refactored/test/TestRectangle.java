package com.techlabs.lsv.refactored.test;

import com.techlabs.lsv.refactored.IPolygon;
import com.techlabs.lsv.refactored.Square;
import com.techlabs.lsv.refactored.Rectangle;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 20);
		calculateArea(rect);
		Square square = new Square(10);
		calculateArea(square);

	}

	private static void calculateArea(IPolygon x) {
		System.out.println(x.area());
	}

}
