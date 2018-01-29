package com.practice.patterns.behavioural.template.ex1;

public abstract class CoffeeTemplate {
	public final void prepareCoffee(){
		boilWater();
		addMilk();
		addSugar();
		addPowder();
		System.out.println("Coffee is ready..!");
	}

	public abstract void boilWater();

	private void addMilk() {
		System.out.println("Adding milk..");
	}

	private void addSugar() {
		System.out.println("Adding sugar..");
	}

	public abstract void addPowder();
}
