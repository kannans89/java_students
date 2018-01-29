package com.techlabs.decorator;

public class ColorDecorator implements IShape {
	private IShape baseShape;
	private String color;

	public ColorDecorator(IShape baseShape, String color) {
		this.baseShape = baseShape;
		this.color = color;
	}

	@Override
	public void draw() {
		this.baseShape.draw();
		addColor();
	}

	private void addColor() {
		System.out.println("Color:" + this.color);
	}

}
