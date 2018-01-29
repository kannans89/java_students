package com.techlabs.rectangle;

public class Circle extends Rectangle {

	private final int radius;

	public Circle(int radius, int width, int height) {
		super(width, height);
		this.radius = radius;
	}

	public float calcCircleArea() {
		return 3.14f * radius * radius;
	}

}
