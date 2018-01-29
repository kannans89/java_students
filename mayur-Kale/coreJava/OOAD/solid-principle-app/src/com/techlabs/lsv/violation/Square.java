package com.techlabs.lsv.violation;

public class Square extends Rectangle {

	public Square(int size) {
		super(size, size);
	}

	@Override
	public void setWidth(int width) {
		this.width = this.height = width;
	}

	@Override
	public void setHeight(int height) {

		this.height = this.width = height;
	}

}
