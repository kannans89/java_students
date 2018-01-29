package com.techlabs.principle.lsp.solution1.test;

import com.techlabs.principle.lsp.solution1.Rectangle;
import com.techlabs.principle.lsp.solution1.Square;

public class Test {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setHeight(100);
		rect.setWidth(50);
		System.out.println("Area of Rectangle is : "+rect.calculateArea());
		System.out.println("=============================================");
		Rectangle rect1 = new Square();
		rect1.setHeight(100);
		rect1.setWidth(50);
		System.out.println("Area of Rectangle is :"+rect1.calculateArea());

	}

}
