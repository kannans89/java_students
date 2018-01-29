package com.techlabs.patterns.structural.adapter;

public class LineItemAdapter implements IDiscount {

	LineItem lineItem;

	public LineItemAdapter(String name, int quantity, double amount) {
		lineItem = new LineItem(name, quantity, amount);
	}

	@Override
	public double getDiscount() {
		return lineItem.calcItemDiscount();
	}
}
