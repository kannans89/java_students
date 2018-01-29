package com.techlabs.patterns.structural.decorator.ex2;

public class CoffeeTest {

	public static void main(String[] args) {
		ICoffee coffeeobj = new Whip(new Mocha(
				new Mocha(new Soy(new HouseBlend()))));
		String ingreadiants = coffeeobj.coffeeIngredians();
		double cost = coffeeobj.cost();
		System.out.println("Coffee Ingrediants :- " + ingreadiants);
		System.out.println("Total Cost : $" + cost);
	}

}
