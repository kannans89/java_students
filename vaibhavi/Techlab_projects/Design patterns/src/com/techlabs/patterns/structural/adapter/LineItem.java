package com.techlabs.patterns.structural.adapter;

public class LineItem {
	

	private String name;
	private int quantity;
	private double price;
	
	public LineItem(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public double getTotal()
	{
		return quantity*price;
	}
	
	public double getItemDiscount()
	{
		return getTotal()*.50;
	}


}
