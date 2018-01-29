package com.practice.chapter4.simple.factory;

public class TestPizza {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new PizzaStore(new NYPizzaFactory());
		nyStore.orderPizza("cheese");
		System.out.println("\n===");
		
		PizzaStore chicagoStore = new PizzaStore(new ChicagoPizzaFactory());
		chicagoStore.orderPizza("veggie");
		
	}

}
