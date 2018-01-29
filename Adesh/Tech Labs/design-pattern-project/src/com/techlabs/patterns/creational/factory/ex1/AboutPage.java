package com.techlabs.patterns.creational.factory.ex1;

class AboutPage extends Page{

	public AboutPage(String description) {
		super(description);
	}

	@Override
	public void load() {
		System.out.println("In the "+getDescription());
	}

}
