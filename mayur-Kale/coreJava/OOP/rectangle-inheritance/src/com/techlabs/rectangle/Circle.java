package com.techlabs.rectangle;

public class Circle extends Rectangle {

	private int radius;

	public Circle() {
		super();
		System.out.println("Circle created");
		
	}
	public float getCircleArea() {
		return 3.14f * radius * radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
