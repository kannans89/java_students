package com.techlabs.patterns.structural.decorator.ex2;

public class Soy extends CondimentsDecorator {

	public Soy(ICoffee coffeeToWrap) {
		super(coffeeToWrap);
	}

	@Override
	public String coffeeIngredians() {
		return coffee.coffeeIngredians() + addSoy();
	}

	private String addSoy(){
		return "+ Soy";
	}
	@Override
	public double cost() {
		return coffee.cost()+0.15;
	}

}
