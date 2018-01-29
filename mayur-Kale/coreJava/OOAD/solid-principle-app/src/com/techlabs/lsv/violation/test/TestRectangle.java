package com.techlabs.lsv.violation.test;

import com.techlabs.lsv.violation.Rectangle;
import com.techlabs.lsv.violation.Square;

public class TestRectangle {
	public static void main(String[] args) {

		Rectangle rect = new Rectangle(30, 40);
		shouldNot_ChangeWidthWhenHeightIsChanged(rect);
		System.out.println("----");
		Square square = new Square(30);
		shouldNot_ChangeWidthWhenHeightIsChanged(square);
	}

	private static void shouldNot_ChangeWidthWhenHeightIsChanged(Rectangle x) {
		int currWidth = x.getWidth();
		
		x.setHeight(20);
		System.out.println("Excepted Width:"+currWidth);
		System.out.println("Actual Width:"+x.getWidth());
		
	}
}
