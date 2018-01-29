package com.techlabs.patterns.structural.adapter;

public class LineItemAdapter implements IDiscount {

	LineItem lineitem;
	
	 public LineItemAdapter(String name, int quantity, double price) {
		 
		 lineitem=new LineItem(name, quantity, price);

	 }
	@Override
	public double getDiscount() {
		return lineitem.getItemDiscount();
	}

}
