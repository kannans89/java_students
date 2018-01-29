package com.techlabs.patterns.creational.factory.ex1;

class LineItem extends Page{

	public LineItem(String description) {
		super(description);
	}

	@Override
	public void load() {
		System.out.println(getDescription()+" is here..");
	}

}
