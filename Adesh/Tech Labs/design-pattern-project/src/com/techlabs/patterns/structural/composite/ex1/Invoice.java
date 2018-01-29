package com.techlabs.patterns.structural.composite.ex1;

import java.util.ArrayList;
import java.util.List;

public class Invoice implements IOrderComponent{
	private String name;
	private String description;
	private List<IOrderComponent> items;
	
	public Invoice(String name, String description){
		this.name = name;
		this.description = description;
		items = new ArrayList<IOrderComponent>();
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public List<IOrderComponent> getItems() {
		return items;
	}
	
	public void addItems(IOrderComponent type){
		items.add(type);
	}

	public void printOrderDetails() {
		System.out.println("====================\n"+getName()+" printing...\n==================");
		
		for(IOrderComponent item:items){
			item.printOrderDetails();
		}
	}

}
