package com.techlabs.patterns.structural.decorator.ex2;

public class Mocha extends CondimentsDecorator{

	public Mocha(ICoffee coffeeToWrap) {
		super(coffeeToWrap);
	}

	@Override
	public String coffeeIngredians() {
		return coffee.coffeeIngredians()+ addMocha();
	}
	
	private String addMocha(){
		return "+ Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return coffee.cost()+0.20;
	}
	

}
