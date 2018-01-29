package com.techlabs.principles.lsp.solution1.test;

import com.techlabs.principles.lsp.solution1.Rectangle;
import com.techlabs.principles.lsp.solution1.Square;

public class Test {

	public static void main(String[] args) {
		
		//Rectangle rect=new Rectangle(); 
		Rectangle rect=new Square();
		rect.setWidth(100);
		rect.setHeight(50);
		System.out.println("Area of the rectangle is : "+rect.calculateArea());
		
	}

}
