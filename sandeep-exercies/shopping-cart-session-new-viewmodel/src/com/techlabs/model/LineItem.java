package com.techlabs.model;

public class LineItem {
	private int quantity;
	private Product product;

	public LineItem() {
		System.out.println("in lineItem-constructor");
	}
	
	public LineItem(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
