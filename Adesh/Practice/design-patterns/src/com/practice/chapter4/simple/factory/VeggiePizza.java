package com.practice.chapter4.simple.factory;

import com.practice.chapter4.factory.method.Pizza;

public class VeggiePizza extends Pizza{

	public VeggiePizza(){
		name = "deep dish veggie pizza";
		dough = "Extra thick crust Dough";
		sauce = "chilli sauce";
		
		toppings.add("shreaded veggie");
	}
}
