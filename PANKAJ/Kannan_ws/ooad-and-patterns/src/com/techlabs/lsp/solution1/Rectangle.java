package com.techlabs.lsp.solution1;

public class Rectangle {
	int length;
	int width;
	
	public int getWidth(){
		return width;
	}
	
	public int getLength(){
		return length;
	}
	
	public void setWidth(int width){
		this.width=width;
	}
	
	public void setLength(int length){
		this.length=length;
	}
	
	public int calcArea(){
		return length*width;
	}

}
