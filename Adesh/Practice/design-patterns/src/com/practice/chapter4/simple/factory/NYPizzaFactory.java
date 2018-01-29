package com.practice.chapter4.simple.factory;

import com.practice.chapter4.factory.method.Pizza;

public class NYPizzaFactory extends SimplePizzaFactory{

	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			return new CheesePizza();
		}else if(type.equals("veggie")){
			return new VeggiePizza();
		}else if(type.equals("clam")){
			return new ClamPizza();
		}
		return pizza;
	}
}
