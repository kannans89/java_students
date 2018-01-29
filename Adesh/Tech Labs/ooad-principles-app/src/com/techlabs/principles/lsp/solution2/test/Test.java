package com.techlabs.principles.lsp.solution2.test;

import com.techlabs.principles.lsp.solution2.IPolygon;
import com.techlabs.principles.lsp.solution2.Rectangle;
import com.techlabs.principles.lsp.solution2.Square;

public class Test {

	public static void main(String[] args) {
		
		IPolygon polygon;
		
		//polygon = new Square(50);
		polygon = new Rectangle(100, 50);
		System.out.println(polygon);
	}

}
