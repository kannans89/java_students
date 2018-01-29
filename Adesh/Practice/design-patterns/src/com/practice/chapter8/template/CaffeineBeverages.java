package com.practice.chapter8.template;

public abstract class CaffeineBeverages {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	public abstract void addCondiments();

	public abstract void brew();

	private void boilWater() {
		System.out.println("Boiling Water..");
	}

	public void pourInCup() {
		System.out.println("Pouring into cup..");
	}

	public boolean customerWantsCondiments() {
		return true;
	}

}
