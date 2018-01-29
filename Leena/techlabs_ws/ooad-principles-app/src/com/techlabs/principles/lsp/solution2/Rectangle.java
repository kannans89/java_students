package com.techlabs.principles.lsp.solution2;

public class Rectangle implements IPolygon{

	private int width;
	private int height;
	
	public Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	
	
	public void setWidth(int width){
		this.width=width;
	}

	public void setHeight(int height){
		this.height=height;
	}
	
	@Override
	public int calculateArea(){
		return (this.height*this.width);
	}
}
