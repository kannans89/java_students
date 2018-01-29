package com.practice.chapter4.abstrct.factory.pattern;

public class TestPizza {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza pizza = nyStore.orderPizza("Cheese");
		
	}
}
