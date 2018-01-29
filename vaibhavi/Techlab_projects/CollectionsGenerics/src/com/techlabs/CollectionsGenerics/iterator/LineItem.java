package com.techlabs.CollectionsGenerics.iterator;



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

}

