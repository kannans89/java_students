package com.techlabs.patterns.structural.decorator.ex2;

public abstract class CondimentsDecorator implements ICoffee{
	ICoffee coffee;
	
	public CondimentsDecorator(ICoffee coffeeToWrap){
		coffee = coffeeToWrap;
	}

}
