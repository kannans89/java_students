package com.practice.patterns.structural.adapter.ex1.oldvendor;

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

	public double getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
	
	public double calculateTotalPrice(){
		return this.price = (this.price * this.quantity);
	}
	public double getDiscount(){
		return (calculateTotalPrice() * 0.6);
	}
}
