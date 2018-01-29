package com.techlabs.principles.lsp.solution1;

public class Square extends Rectangle{
	private int side;

	public void setWidth(int side) {
		this.width = side;
		this.height = side;
	}

	public void setHeight(int side) {
		this.width = side;
		this.height = side;
	}

}
