package com.techlabs.collection;

public class LineItem /* implements Comparable<LineItem> */{
	private int id;
	private String name;
	private double price;
	private int quantity;

	/*
	 * public boolean equals(Object item) { LineItem lineItem = (LineItem) item;
	 * return getName().equals(lineItem.getName()); }
	 * 
	 * public int hashCode() { return this.name.hashCode(); }
	 * 
	 * public int compareTo(LineItem item) { LineItem lineItem = (LineItem)
	 * item; return name.compareTo(lineItem.getName()); }
	 */
	public LineItem(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public double getPrice() {
		return this.price;
	}

	public double getTotalPrice() {
		return this.quantity * this.price;
	}

	/*
	 * @Override public String toString() { return "LineItem id = " + id +
	 * "\nname = " + name + "\nprice = " + price + "\nquantity = " + quantity; }
	 */

}
