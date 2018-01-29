package com.techlabs.principles.lsp.solution2.test2;

import com.techlabs.principles.lsp.solution2.IPolygon;
import com.techlabs.principles.lsp.solution2.Rectangle2;
import com.techlabs.principles.lsp.solution2.Square2;

public class Test2 {

	public static void main(String[] args) {
		
		IPolygon polygon;
		//polygon = new Rectangle2(100, 50);
		polygon = new Square2(50);
		System.out.println(polygon);
	}

}
