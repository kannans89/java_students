package com.practice.patterns.creational.factory.ex1;

 class HomePage extends Page{

	public HomePage(String desc) {
		super(desc);
	}

	@Override
	public void load() {
		System.out.println(getDescription()+" is loading..");
	}

}
