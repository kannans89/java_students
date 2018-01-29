package com.techlabs.collections;

public class LineItem implements Comparable<LineItem> {
	// constructor
	public LineItem(int id, String name, int quantity, double price) {
		productID = id;
		productName = name;
		productQuantity = quantity;
		productPrice = price;
	}

	// Methods

	@Override
	public boolean equals(Object objectToCompare) {
		LineItem l = (LineItem) objectToCompare;
		return (getProductID() == (l.getProductID()));
	}

	@Override
	public int hashCode() {
		return getProductID();
	}

	public boolean checkForDuplicate(LineItem objectToCheck) {
		if (equals(objectToCheck) == true
				&& hashCode() == objectToCheck.hashCode()) {
			return true;
		} else
			return false;
	}

	@Override
	public int compareTo(LineItem lineObject) {
		return getProductName().compareTo(lineObject.getProductName());
	}

	public double getTotalPrice() {
		double totalPrice = 0;
		totalPrice = getproductPrice() * getproductQuantity();
		// totalPrice = this.productQuantity * this.productPrice;
		return totalPrice;
	}

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public int getproductQuantity() {
		return productQuantity;
	}

	public double getproductPrice() {
		return productPrice;
	}

	@Override
	public String toString() {
		return "Product ID : " + getProductID();
	}

	// instance Variables
	private int productID;
	private String productName;
	private int productQuantity;
	private double productPrice;

}
