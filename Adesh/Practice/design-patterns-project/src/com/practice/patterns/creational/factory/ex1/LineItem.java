package com.practice.patterns.creational.factory.ex1;

 class LineItem extends Page{

	public LineItem(String desc) {
		super(desc);
	}

	@Override
	public void load() {
		System.out.println("In the "+getDescription());
	}

}
