package com.techlabs.patterns.behavioral.template.method;

public abstract class CoffeeTemplate {

	public final void prepareCoffee() {
		boilWater();
		addMilk();
		addSugure();
		addCoffee();

	}

	public abstract void boilWater();

	public abstract void addMilk();

	public abstract void addSugure();

	public abstract void addCoffee();

}
