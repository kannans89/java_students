package com.techlabs.patterns.creational.factory.method;

 class AboutUsPage extends Page {
	 
	public AboutUsPage(String description){
		super(description);
	}

	@Override
	public void load() {
		System.out.println("Loading "+getDescription());
		
	}
}
