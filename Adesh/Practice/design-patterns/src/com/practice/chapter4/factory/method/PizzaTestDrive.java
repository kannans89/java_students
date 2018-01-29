package com.practice.chapter4.factory.method;

public class PizzaTestDrive {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Adesh ordered a "+pizza.getName()+"\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("rahul ordered a "+pizza.getName()+"\n");
	}

}
