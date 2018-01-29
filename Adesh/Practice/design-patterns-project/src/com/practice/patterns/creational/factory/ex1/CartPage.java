package com.practice.patterns.creational.factory.ex1;

 class CartPage extends Page{

	public CartPage(String desc) {
		super(desc);
	}

	@Override
	public void load() {
		System.out.println(getDescription()+" is loading.. please wait..");
	}

}
