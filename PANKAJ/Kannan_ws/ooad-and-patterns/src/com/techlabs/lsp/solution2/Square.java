package com.techlabs.lsp.solution2;

public class Square implements IPolygon{

	int side;
	
	public Square(int side){
		this.side=side;
	}
	
	@Override
	public int calcArea(){
		return side*side;
	}
}
