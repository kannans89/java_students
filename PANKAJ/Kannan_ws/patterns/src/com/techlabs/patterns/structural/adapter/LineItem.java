package com.techlabs.patterns.structural.adapter;

public class LineItem {
	String name;
	int quantity;
	double price;
	
	public LineItem(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public double getTotal(){
		return quantity*price;
	}
	
	public double calcItemDiscount(){
		return getTotal()*0.2;
	}
}
