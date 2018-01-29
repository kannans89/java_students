package com.techlabs.lsp.solution1.test;

import com.techlabs.lsp.solution1.Rectangle;
import com.techlabs.lsp.solution1.Square;

public class Test {

	public static void main(String[] args) {

		Rectangle rectangle=new Rectangle();
		rectangle.setLength(10);
		rectangle.setWidth(20);
		System.out.println(rectangle.calcArea());
		
		Rectangle square=new Square(); //substituting with child child class.. Violation of LSP
		square.setLength(10);
		square.setWidth(15);
		System.out.println(square.calcArea());
	}
}
