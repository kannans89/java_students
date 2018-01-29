package com.techlabs.patterns.behavioral.template.method;

public class NesCafe extends CoffeeTemplate {

	@Override
	public void boilWater() {
		System.out.println("300 ml water to Boil");
	}

	@Override
	public void addMilk() {
		System.out.println("Add 200ml Milk");
	}

	@Override
	public void addSugure() {
		System.out.println("Add 3 teaspoon of Suger");

	}

	@Override
	public void addCoffee() {
		System.out.println("Add 2 teaspoon of Coffee");

	}

}
