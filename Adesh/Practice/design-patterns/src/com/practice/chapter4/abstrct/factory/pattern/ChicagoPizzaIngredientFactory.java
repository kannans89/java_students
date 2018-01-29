package com.practice.chapter4.abstrct.factory.pattern;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Veggie[] createVeggie() {
		Veggie veggie[] = {new Potato(), new Ginger()};
		return veggie;
	}

	public PepperOni createPepperOni() {
		return new CutPepperOni();
	}

	public Clam createClam() {
		return new FrozenClam();
	}

}
