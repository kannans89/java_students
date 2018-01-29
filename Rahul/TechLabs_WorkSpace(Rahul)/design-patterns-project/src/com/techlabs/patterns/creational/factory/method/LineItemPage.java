package com.techlabs.patterns.creational.factory.method;

 class LineItemPage extends Page{

	public LineItemPage(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		System.out.println("Loading "+getDescription());
		
	}

}
