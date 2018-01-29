package com.techlabs.model;

public class LineItem {
	private Product product;
	private int quantity;
	private String id;
	private int cost;
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LineItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public LineItem() {
		// TODO Auto-generated constructor stub
	}

	public int calculateLineItemCost() {
		this.cost=quantity * product.getPrice();
		return quantity * product.getPrice();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	

}
