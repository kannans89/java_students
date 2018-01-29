package com.techlabs.principle.lsp.solution2.test;

import com.techlabs.principle.lsp.solution2.IPolygon;
import com.techlabs.principle.lsp.solution2.Rectangle;
import com.techlabs.principle.lsp.solution2.Square;

public class Test {

	public static void main(String[] args) {
		IPolygon polygon = new Rectangle(100, 50);
		System.out.println("Area :"+polygon.calculateArea());
		
		polygon = new Square(50);
		System.out.println("Area :"+polygon.calculateArea());

	}

}
