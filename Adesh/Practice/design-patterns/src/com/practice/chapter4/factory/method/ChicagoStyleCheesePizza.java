package com.practice.chapter4.factory.method;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza(){
		name = "Chicago Style deep dish cheese pizza";
		dough = "Extra thick crust Dough";
		sauce = "tomato sauce";
		
		toppings.add("shreaded Cheese");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
}
