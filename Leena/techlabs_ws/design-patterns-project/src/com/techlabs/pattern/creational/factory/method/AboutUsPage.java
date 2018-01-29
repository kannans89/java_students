package com.techlabs.pattern.creational.factory.method;

class AboutUsPage extends Page {

	public AboutUsPage(String description) {
		super(description);
	}

	@Override
	public void load(){
		System.out.println(this.getDescription()+" is loading");
	}
	
}
