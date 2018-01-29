package com.practice.chapter4.factory.method;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza(){
		name = "NY Style sauce and veggi pizza";
		dough = "Thin crust Dough";
		sauce = "Marinara sauce";
		
		toppings.add("manchuriaan veggi");
	}
}
