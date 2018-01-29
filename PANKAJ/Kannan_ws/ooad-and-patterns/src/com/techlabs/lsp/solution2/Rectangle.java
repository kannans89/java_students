package com.techlabs.lsp.solution2;

public class Rectangle implements IPolygon {

	int length,width;
	
	public Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	
	@Override
	public int calcArea() {
		return length*width;
	}

}
