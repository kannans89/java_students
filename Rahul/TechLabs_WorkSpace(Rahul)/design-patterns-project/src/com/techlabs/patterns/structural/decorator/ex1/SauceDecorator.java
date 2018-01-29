package com.techlabs.patterns.structural.decorator.ex1;

public class SauceDecorator extends SandwichDecorator {

	public SauceDecorator(ISandwich wrapTO) {
		super(wrapTO);
	}

	@Override
	public String makeSandwich() {

		return sandwich.makeSandwich() + addSauce();
	}

	private String addSauce() {
		return " + Chilly";
	}

	@Override
	public double cost() {
		return sandwich.cost() + 20.00;
	}

}
