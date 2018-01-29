package com.practice.patterns.structural.decorator.ex1;

public class SauceDecorator extends SandwichDecorator{

	public SauceDecorator(ISandwich customSandwich) {
		super(customSandwich);
	}

	public String makeSandwich() {
		return customSandwich.makeSandwich() + addsauce();
	}

	private String addsauce() {
		return " + Chili Sauce";
	}

	public double getPrice() {
		return customSandwich.getPrice() + saucePrice();
	}

	private double saucePrice() {
		return 5;
	}

}
