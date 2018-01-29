package com.practice.patterns.creational.factory.ex1;

 class PostPage extends Page{

	public PostPage(String desc) {
		super(desc);
	}

	@Override
	public void load() {
		System.out.println("you can post here in "+getDescription());
	}

}
