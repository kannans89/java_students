package com.techlabs.pattern.creational.factory.method;

public abstract class Page {
	
	private String description;
	
	public Page(String description){
		this.description=description;
	}

	public String getDescription(){
		return this.description;
	}
	
	public abstract void load();
}
