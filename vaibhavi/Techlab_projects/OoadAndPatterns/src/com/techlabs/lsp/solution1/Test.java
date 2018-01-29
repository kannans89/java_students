package com.techlabs.lsp.solution1;

public class Test {
	
	

	public static void main(String[] args) {

		Rectangle obj;
		obj=new Rectangle();
		//=new Square();  Substituting with child will give u unexpected output
		obj.setHeight(100);
		obj.setWidth(50);
		System.out.println(obj.calculateArea());
	}

}
