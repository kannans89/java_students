package com.practice.patterns.creational.factory.ex1;

 class AboutPage extends Page{

	public AboutPage(String desc) {
		super(desc);
	}

	@Override
	public void load() {
		System.out.println(getDescription()+" is here.");
	}

}
