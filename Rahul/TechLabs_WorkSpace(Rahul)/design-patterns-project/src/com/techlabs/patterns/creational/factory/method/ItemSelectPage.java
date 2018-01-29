package com.techlabs.patterns.creational.factory.method;

 class ItemSelectPage extends Page{

	public ItemSelectPage(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		System.out.println("Loading "+getDescription());
		
	}

}
