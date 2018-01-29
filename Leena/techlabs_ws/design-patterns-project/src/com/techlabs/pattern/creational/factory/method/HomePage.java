package com.techlabs.pattern.creational.factory.method;

class HomePage extends Page{

	public HomePage(String description) {
		super(description);
	}

	@Override
	public void load(){
		System.out.println(this.getDescription()+" is loading");
	}
	
}
