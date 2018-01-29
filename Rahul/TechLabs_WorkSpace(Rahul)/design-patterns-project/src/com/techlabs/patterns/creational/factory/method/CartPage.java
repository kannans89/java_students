package com.techlabs.patterns.creational.factory.method;

 class CartPage extends Page {

	public CartPage(String description) {
		super(description);
		
	}

	@Override
	public void load() {
		System.out.println("Description "+getDescription());
		
	}
	 

}
