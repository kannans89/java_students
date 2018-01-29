package com.techlabs.shopping.model;

public class LineItem {
	private int quantity;
	private double total;

	private Product product;

	public LineItem(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		this.total = 0;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total = product.getProductPrice() * getQuantity();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}