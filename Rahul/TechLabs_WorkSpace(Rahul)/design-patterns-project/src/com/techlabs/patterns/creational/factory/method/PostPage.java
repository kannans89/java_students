package com.techlabs.patterns.creational.factory.method;

 class PostPage extends Page {

	public PostPage(String description) {
		super(description);
		}

	@Override
	public void load() {
		System.out.println("Loading "+getDescription());
		
	}

}
