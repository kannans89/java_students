package com.practice.chapter4.abstrct.factory.pattern;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Cheese createCheese() {
		return new RaggianoCheese();
	}

	public Sauce createSauce() {
		return new ChilliSauce();
	}

	public Veggie[] createVeggie() {
		Veggie veggie[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggie;
	}

	public PepperOni createPepperOni() {
		return new SlicedPepperOni();
	}

	public Clam createClam() {
		return new FreshClam();
	}

}
