package com.techlabs.patterns.structural.decorator.ex2;

public class DarkRoast implements ICoffee {

	@Override
	public String coffeeIngredians() {

		return "Dark Rost";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
