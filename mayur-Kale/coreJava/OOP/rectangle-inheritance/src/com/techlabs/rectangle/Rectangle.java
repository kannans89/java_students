package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		
		System.out.println("Rectangle created");
	}

	public int getRectArea() {
		return width * height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
