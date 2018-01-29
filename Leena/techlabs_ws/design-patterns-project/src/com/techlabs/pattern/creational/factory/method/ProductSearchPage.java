package com.techlabs.pattern.creational.factory.method;

class ProductSearchPage extends Page{

	public ProductSearchPage(String description) {
		super(description);
	}

	@Override
	public void load(){
		System.out.println(this.getDescription()+" is loading");
	}
	
	
}
