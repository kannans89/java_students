package com.techlabs.srp.refactored;

public class Invoice {
	private final int id;
	private final String description;
	private final double cost;
	private final double discount;

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getCost() {
		return cost;
	}

	public double getDiscount() {
		return discount;
	}

	public Invoice(int id, String decription, double cost, double discount) {

		this.id = id;
		this.description = decription;
		this.cost = cost;
		this.discount = discount;
	}

	public double calcDiscount() {
		return (cost - (cost * discount * 0.01));
	}

	public double calcTotal() {
		return (this.calcDiscount() + (cost * 14.2 * 0.01));
	}

	public void print() {
		System.out.println("Id: " + id + " Description: " + description
				+ " Total cost: " + calcTotal());
	}
}
