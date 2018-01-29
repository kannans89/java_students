package com.techlabs.patterns.structural.decorator.ex2;

public class Espresso implements ICoffee {

	@Override
	public String coffeeIngredians() {
		return "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
