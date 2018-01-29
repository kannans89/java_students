package com.practice.patterns.structural.composite.ex1;

import java.util.ArrayList;
import java.util.List;

public class Invoice implements IOrderComponent{
	private String name;
	private String description;
	private List<IOrderComponent> items;
	
	public Invoice(String n, String desc){
		name = n;
		description = desc;
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
	
	public void addItems(IOrderComponent type) {
		items.add(type);
	}
	
	public void printOrderDetails() {
		System.out.println("\n============="+getName()+"================");
		System.out.println("Description ==> "+getDescription());
		
		for(IOrderComponent item:items){
			item.printOrderDetails();
		}
	}

}
