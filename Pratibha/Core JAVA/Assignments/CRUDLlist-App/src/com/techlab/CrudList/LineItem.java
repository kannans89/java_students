package com.techlab.CrudList;

public class LineItem {
	private final int id;
	private final String name;
	private final double unitPrice;
	private int quantity;

	public LineItem(int id, String name, int quantity, double unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
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
		return (this.quantity * this.unitPrice);
	}

	@Override
	public String toString() {
		return ("\nID= " + id + "\nName= " + name + "\nQuantity= " + quantity
				+ "\nUnit prize= " + unitPrice + "\n" + "Total Prize="
				+ calculateTotalPrice() +  " ");

	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		LineItem lineitem = (LineItem) obj;
		if (this.id != lineitem.id)
			return false;
		if (this.name != lineitem.name)
			return false;
		if (this.quantity != lineitem.quantity)
			return false;
		if (this.unitPrice != lineitem.unitPrice)
			return false;

		return true;
	}

}