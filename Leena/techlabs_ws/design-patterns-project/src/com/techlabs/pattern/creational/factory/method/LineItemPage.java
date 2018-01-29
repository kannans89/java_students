package com.techlabs.pattern.creational.factory.method;

public class LineItemPage extends Page{

	public LineItemPage(String description) {
		super(description);
	}

	@Override
	public void load(){
		System.out.println(this.getDescription()+" is loading");
	}
	
}
