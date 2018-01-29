package com.techlabs.patterns.structural.decorator.ex2;

public class Whip extends CondimentsDecorator {

	public Whip(ICoffee coffeeToWrap) {
		super(coffeeToWrap);
	}

	@Override
	public String coffeeIngredians() {
		return coffee.coffeeIngredians() + addWhip();
	}
	
	private String addWhip(){
		return "+ Whip";
	}

	@Override
	public double cost() {
		return coffee.cost()+0.10;
	}

}
