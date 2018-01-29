package com.techlabs.rectangle;

public class Rectangle {
	private final int width;
	private final int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int calcRectArea() {
		return width * height;
	}

}
