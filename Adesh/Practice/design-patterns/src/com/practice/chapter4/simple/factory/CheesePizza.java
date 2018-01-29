package com.practice.chapter4.simple.factory;

import com.practice.chapter4.factory.method.Pizza;

public class CheesePizza extends Pizza {

	@SuppressWarnings("unchecked")
	public CheesePizza(){
		name = "deep dish cheese pizza";
		dough = "Extra thick crust Dough";
		sauce = "tomato sauce";
		
		toppings.add("shreaded Cheese");
	}
}
