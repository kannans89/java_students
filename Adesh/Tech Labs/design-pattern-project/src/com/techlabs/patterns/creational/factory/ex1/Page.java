package com.techlabs.patterns.creational.factory.ex1;

public abstract class Page {
	private String description;
	
	public Page(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
	
	public abstract void load();
}
