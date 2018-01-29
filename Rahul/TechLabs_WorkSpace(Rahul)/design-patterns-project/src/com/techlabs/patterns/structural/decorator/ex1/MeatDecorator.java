package com.techlabs.patterns.structural.decorator.ex1;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(ISandwich wrapTO) {
		super(wrapTO);
	}

	@Override
	public String makeSandwich() {

		return sandwich.makeSandwich() + addMeat();
	}

	private String addMeat() {
		return " + Chicken";
	}

	@Override
	public double cost() {

		return (sandwich.cost() + 45.00);
	}

}
