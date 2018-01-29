package com.practice.patterns.creational.factory.ex1;

public abstract class Page {
	private String description;
	
	public Page(String desc){
		description = desc;
	}
	
	public String getDescription(){
		return description;
	}
	
	public abstract void load();
}
