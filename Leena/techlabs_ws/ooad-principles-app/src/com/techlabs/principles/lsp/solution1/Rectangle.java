package com.techlabs.principles.lsp.solution1;

public class Rectangle {
	
	protected int width;
	protected int height;
	
	
	
	public void setWidth(int width){
		this.width=width;
	}

	public void setHeight(int height){
		this.height=height;
	}
	
	public int calculateArea(){
		return (this.width*this.height);
	}
		
		
}
