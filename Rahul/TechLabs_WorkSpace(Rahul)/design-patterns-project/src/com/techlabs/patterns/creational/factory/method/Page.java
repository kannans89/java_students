package com.techlabs.patterns.creational.factory.method;

public abstract class Page {
	//ivars
	private String pageDescription;
	
	//Constructor
	public Page(String description){
		pageDescription = description;
	}
	//Methods
	public String getDescription(){
		return pageDescription;
	}
	public abstract void load();

}
