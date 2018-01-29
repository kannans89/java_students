package com.techlabs.patterns.structural.composite.ex1;

public class LineItem implements IOrderComponent {

	// Ivars
	private int productID;
	private String productName;
	private int productQuantity;
	private double productPrice;

	// Constructor
	public LineItem(int id, String name, int quantity, double price) {
		productID = id;
		productName = name;
		productQuantity = quantity;
		productPrice = price;
	}

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	@Override
	public void printOrderDetails() {
		
		System.out.println(getProductID() + " 	 " + getProductName() + " 	 "
				+ getProductQuantity() + " 	 " + getProductPrice());
		System.out.println();
		
	}

}
