package com.techlabs.patterns.creational.factory.ex1;

class HomePage extends Page{

	public HomePage(String description) {
		super(description);
	}

	@Override
	public void load() {
		System.out.println(getDescription()+" is Loading");
	}

}
