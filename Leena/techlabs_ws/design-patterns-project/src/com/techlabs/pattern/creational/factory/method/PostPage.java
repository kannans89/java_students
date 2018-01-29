package com.techlabs.pattern.creational.factory.method;

class PostPage extends Page {

	public PostPage(String description) {
		super(description);
	}

	@Override
	public void load(){
		System.out.println(this.getDescription()+" is loading");
	}
	
}
