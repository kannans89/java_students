package com.techlabs.patterns.creational.factory.ex1;

class PostPage extends Page{

	public PostPage(String description) {
		super(description);
	}

	@Override
	public void load() {
		System.out.println("We can Post Here = "+getDescription());
	}

}
