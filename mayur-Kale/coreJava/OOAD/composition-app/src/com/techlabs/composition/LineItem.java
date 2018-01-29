package com.techlabs.composition;

public class LineItem {
	private final int id;
	private final int qty;
	private Product product;

	public LineItem(int id, int qty, Product product) {
		this.id = id;
		this.qty = qty;
		this.product = product;
	}

	public double calcTotalPrice() {
		return product.calcDiscountCost() * this.qty;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", qty=" + qty + ", product=" + product
				+ "]";
	}

	public int getQty() {
		return qty;
	}
}
