package com.techlabs.lsv.violation;

public class Rectangle {

	protected int height;
	protected int width;
	
	public Rectangle(int width,int height) {
		this.width =width;
		this.height = height;
	}

	public int getArea(){
		return (this.width*this.height);
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
}
