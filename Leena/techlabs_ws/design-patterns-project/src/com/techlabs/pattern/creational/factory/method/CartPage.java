package com.techlabs.pattern.creational.factory.method;

class CartPage extends Page{

	public CartPage(String description) {
		super(description);
	}

	@Override
	public void load(){
		System.out.println(this.getDescription()+" is loading");
	}
	
}
