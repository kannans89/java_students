package com.techlabs.patterns.structural.decorator.ex2;

public class HouseBlend implements ICoffee {

	@Override
	public String coffeeIngredians() {
		return "House Blend";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
