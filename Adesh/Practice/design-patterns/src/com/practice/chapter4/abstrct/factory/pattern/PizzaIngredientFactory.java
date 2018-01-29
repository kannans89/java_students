package com.practice.chapter4.abstrct.factory.pattern;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Cheese createCheese();
	public Sauce createSauce();
	public Veggie[] createVeggie();
	public PepperOni createPepperOni();
	public Clam createClam();
	
}
