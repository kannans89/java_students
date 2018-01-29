package com.practice.patterns.structural.decorator.ex1;

public class MeatDecorator extends SandwichDecorator{

	public MeatDecorator(ISandwich customSandwich) {
		super(customSandwich);
	}

	public String makeSandwich() {
		return customSandwich.makeSandwich() + addMeat();
	}

	private String addMeat() {
		return " + Turkey";
	}

	public double getPrice() {
		return customSandwich.getPrice() + meatprice();
	}

	private double meatprice() {
		return 15;
	}

}
