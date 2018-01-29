package com.techlabs.invoice.lineitem;

public class LineItem {

	private String name;
	private int id;
	private int quantity;
	private double unitprice;

	public LineItem(String name, int id, int quantity, double unitprice) {
		this.name = name;
		this.id = id;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public double calculateTotalprice() {
		return quantity * unitprice;
	}

	@Override
	public String toString() {
		return "LineItem [name=" + name + ", id=" + id + ", quantity="
				+ quantity + ", unitprice=" + unitprice + "]";
	}

	// @Override
	/*
	 * public int hashCode() { final int prime = 31; int result = 1; result =
	 * prime * result + id; return result; }
	 */

	// @Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineItem other = (LineItem) obj;
		if (id != other.id)
			return false;

		return true;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

}
