package com.techlabs.shape;

public class Circle implements IShape {

	public Circle(){
		System.out.println("IN sircle const");
	}
	@Override
	public void draw() {
		System.out.println("Circle");
	}

}
