package com.practice.collection;

public class LineItem {
	private int id;
	private String name;
	private double price;
	private int quantity;

	public LineItem(int lId, String lName, double lPrice, int lQuantity) {
		id = lId;
		name = lName;
		price = lPrice;
		quantity = lQuantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalPrice() {
		return this.price * this.quantity;
	}

}
