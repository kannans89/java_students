package com.techlabs.patterns.behavioral.template;

public abstract class CoffeeTemplate {

	final public void prepareCoffee(){
		boilWater();
		addMilk();
		addCoffee();
	}
	
	abstract public void boilWater();
	abstract public void addMilk();
	abstract public void addCoffee();
}
