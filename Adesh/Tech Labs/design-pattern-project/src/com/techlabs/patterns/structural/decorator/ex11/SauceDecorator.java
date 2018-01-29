package com.techlabs.patterns.structural.decorator.ex11;

public class SauceDecorator extends SandwichDecorator{

	public SauceDecorator(ISandwich sandwich) {
		super(sandwich);
	}

	public String makeSandwich() {
		return customSandwich.makeSandwich() + addSauce();
	}

	private double saucePrice() {
		return 5 + customSandwich.getPrice();
	}

	private String addSauce() {
		return " + Chili Sauce";
	}

	public double getPrice() {
		return saucePrice();
	}

}
