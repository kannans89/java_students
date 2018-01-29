package com.techlabs.patterns.structural.adapter.ex1.oldvendor;

public class Goods {
	private int id;
	private String name;
	private double quantity;
	private double price;
	
	public Goods(int id, String name, double quantity, double price){
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getQuanity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
	
	public double calculateTotalPrice(){
		this.price = (this.price * this.quantity);
		return price;
	}
	
	public double getDiscount(){
		price = (calculateTotalPrice() * 0.60);
		return price;
	}

}
