package com.techlabs.patterns.structural.decorator.ex11;

public class MeatDecorator extends SandwichDecorator{

	public MeatDecorator(ISandwich sandwich) {
		super(sandwich);
	}

	public String makeSandwich() {
		return customSandwich.makeSandwich() + addMeat();
	}

	private double meatPrice() {
		return 15 + customSandwich.getPrice();
	}

	private String addMeat() {
		return " + Turkey";
	}

	public double getPrice() {
		return meatPrice();
	}
	
}
