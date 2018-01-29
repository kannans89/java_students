package com.techlab.LineItem;

public class LineItem implements Comparable{
	private final int id;
	private final String name;
	private final double unitPrice;
	private int quantity;
	private static int count;
	static {
		count = 1000;
	};

	public LineItem(int id, String name, int quantity, double unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		count += 1;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return unitPrice;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;

	}

	public double calculateTotalPrice() {
		return this.quantity * this.unitPrice;
	}

	public String toString() {

		return (this.id + "\n" + this.name + "\n" + this.quantity + "\n"
				+ this.unitPrice + "\n" + this.unitPrice * this.quantity + "\n" + super
					.toString());

	}

	public static int getCount() {
		return count;
	}

	public int compareTo(Object li) {
		if(this.id>((LineItem) li).getId())
			return 1;
		if(this.id<((LineItem) li).getId())
			return -1;
		else
			return 0;
		
	}

}
