package com.techlabs.srp.violation;

public class Invoice {
	private int id;
	private String description;
	private double cost;
	private double discount;

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
		return (this.calcDiscount() + (cost * 14.2*0.01));
	}
	
	public void print() {
		System.out.println("Id: "+id+" Description: "+description+
				" Total cost: "+calcTotal());
	}
}
