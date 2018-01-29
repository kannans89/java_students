package com.techlabs.shape;

public class Rectangle implements IShape {

	public Rectangle(){
		System.out.println("In rectangle const");
	}
	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
	}

}
