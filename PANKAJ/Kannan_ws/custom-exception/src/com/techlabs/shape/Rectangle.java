package com.techlabs.shape;

import com.techlabs.custom.exception.InvalidDimensionException;

public class Rectangle {
	int width;
	int height;

	public Rectangle(int width, int height) {
		if (width <= 0 || height <= 0)
			throw new InvalidDimensionException("Invalid Dimensions", this);
		else {
			this.width = width;
			this.height = height;
		}
	}

	public int getArea() {
		return width * height;
	}
	
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}

}
