package com.techlabs.principle.lsp.solution1;

public class Rectangle {
	//Instance variables
	protected int width;
	protected int height;
	
	//Methods
	public void setWidth(int widthToSet){
		width= widthToSet;		
	}
	public void setHeight(int heightToSet){
		height= heightToSet;		
	}
	public int calculateArea(){
		return width*height;
	}

}
