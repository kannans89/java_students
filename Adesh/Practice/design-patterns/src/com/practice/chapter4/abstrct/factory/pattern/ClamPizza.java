package com.practice.chapter4.abstrct.factory.pattern;

public class ClamPizza extends Pizza {

PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	public void prepare() {
		System.out.println("preparing "+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
