package com.techlabs.composition;

public class Product {
	private int id;
	private String name;
	private double price;
	private double discount;

	public Product(int id, String name, double price, double discount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public double calcDiscountCost() {
		return (this.price - (this.price * (this.discount * 0.01)));
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", discount=" + discount + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}
}
