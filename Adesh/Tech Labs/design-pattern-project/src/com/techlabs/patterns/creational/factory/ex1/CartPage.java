package com.techlabs.patterns.creational.factory.ex1;

class CartPage extends Page{

	public CartPage(String description) {
		super(description);
	}

	@Override
	public void load() {
		System.out.println(getDescription()+" is Loading");
	}

}
