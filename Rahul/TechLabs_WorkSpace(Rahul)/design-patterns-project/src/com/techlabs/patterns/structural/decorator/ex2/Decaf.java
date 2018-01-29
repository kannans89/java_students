package com.techlabs.patterns.structural.decorator.ex2;

public class Decaf implements ICoffee {

	@Override
	public String coffeeIngredians() {
		
		return "Decaf";
	}

	@Override
	public double cost() {
		
		return 1.05;
	}

}
