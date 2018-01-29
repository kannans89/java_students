package com.techlabs.patterns.structural.composite;

public class LineItem implements IOrderComponent {

	int id;
	String name;
	double amount;

	public LineItem(int id, String name, double amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	@Override
	public void displayInfo() {
		System.out.println("ID:" + id + " Name:" + name + " Amount:" + amount);
	}

}
