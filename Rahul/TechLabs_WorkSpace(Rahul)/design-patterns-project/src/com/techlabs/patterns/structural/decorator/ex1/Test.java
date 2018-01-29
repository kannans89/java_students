package com.techlabs.patterns.structural.decorator.ex1;

public class Test {

	public static void main(String[] args) {
		ISandwich sandwich1 = new SauceDecorator(new MeatDecorator(
				new BasicSimpleSandwich()));
		String ingredians = sandwich1.makeSandwich();
		Double cost = sandwich1.cost();
		System.out.println("Sandwich : " + ingredians + "\nCost : Rs." + cost);
	}

}
