package com.techlabs.lsv.refactored;

public class Square implements IPolygon {
	private int size;

	public Square(int size) {
		this.size = size;
	}

	@Override
	public int area() {
		return size * size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
