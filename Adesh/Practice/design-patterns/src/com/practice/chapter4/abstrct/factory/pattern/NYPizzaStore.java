package com.practice.chapter4.abstrct.factory.pattern;

import com.practice.chapter4.abstrct.factory.pattern.PizzaStore;

public class NYPizzaStore extends PizzaStore{

	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("Cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New york style cheese pizza");
		}else if(type.equals("Veggie")){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New york style veggie pizza");
		}else if(type.equals("Clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New york style clam pizza");
		}
		return pizza;
	}

}
