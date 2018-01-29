package com.techlabs.decorator;

public class TransparencyDecorator implements IShape {
	private IShape baseShape;
	private int transparencyValue;

	public TransparencyDecorator(IShape baseShape, int transparencyValue) {
		this.baseShape = baseShape;
		this.transparencyValue = transparencyValue;
	}

	@Override
	public void draw() {
		baseShape.draw();
		addTransparency();
	}

	private void addTransparency() {
		System.out.println("Transparency:"
				+ (1.0f * this.transparencyValue / 255) * 100 + "%");
	}

}
