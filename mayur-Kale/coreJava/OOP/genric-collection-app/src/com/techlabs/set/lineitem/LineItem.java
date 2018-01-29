package com.techlabs.set.lineitem;

public class LineItem {
	private final int id;
	private final String name;
	private final int quantity;
	private final double price;

	public LineItem(int id, String name, int quantity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;

	}

	public double calcTotalPrice() {
		return quantity * price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		LineItem other = (LineItem) obj;
		if (this.id != other.id)
			return false;
		return true;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

}
