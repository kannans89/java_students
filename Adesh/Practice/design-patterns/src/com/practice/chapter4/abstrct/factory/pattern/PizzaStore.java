package com.practice.chapter4.abstrct.factory.pattern;

import com.practice.chapter4.abstrct.factory.pattern.Pizza;

public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}