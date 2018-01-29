package com.techlabs.shape;

public class Triangle implements IShape {

	public Triangle(){
		System.out.println("In Triangle constructor");
	}
	@Override
	public void draw() {
		System.out.println("Triangle");
	}

}
