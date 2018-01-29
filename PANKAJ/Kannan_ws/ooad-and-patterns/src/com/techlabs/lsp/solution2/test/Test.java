package com.techlabs.lsp.solution2.test;

import com.techlabs.lsp.solution2.Rectangle;
import com.techlabs.lsp.solution2.IPolygon;
import com.techlabs.lsp.solution2.Square;

public class Test {

	public static void main(String[] args) {

		IPolygon polygon=new Rectangle(10,20);
		System.out.println(polygon.calcArea());
		
		polygon=new Square(10);
		System.out.println(polygon.calcArea());
	}

}
