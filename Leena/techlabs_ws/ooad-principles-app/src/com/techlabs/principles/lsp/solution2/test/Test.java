package com.techlabs.principles.lsp.solution2.test;
import com.techlabs.principles.lsp.solution2.Square;
import com.techlabs.principles.lsp.solution2.IPolygon;
import com.techlabs.principles.lsp.solution2.Rectangle;

public class Test {

	public static void main(String[] args) {
		
		
		IPolygon polygon;
        polygon=new Rectangle(100,50);
		//polygon=new Square(50);
		System.out.println("Area of the Polygon is :"+ polygon.calculateArea());
		
		
		
	}

}
