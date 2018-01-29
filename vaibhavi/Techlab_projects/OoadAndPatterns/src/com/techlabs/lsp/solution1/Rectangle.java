package com.techlabs.lsp.solution1;

public class Rectangle {
	protected int height;
	protected int width;

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

	public int calculateArea() {
		return height * width;
	}

}
