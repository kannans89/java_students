package com.techlabs.patterns.structural.decorator.ex2;

public class SteamedMilk extends CondimentsDecorator{

	public SteamedMilk(ICoffee coffeeToWrap) {
		super(coffeeToWrap);
		}

	@Override
	public String coffeeIngredians() {
		return coffee.coffeeIngredians() + addSteamedMilk() ;
	}
	
	private String addSteamedMilk(){
		return "+ Steamed Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return coffee.cost()+0.10;
	}

}
