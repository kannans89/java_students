package com.practice.chapter9.composite;

public class MenuItem extends MenuComponent{

	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, boolean vegetarian, double price, String description){
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}

	public void print() {
		System.out.print(" "+getName());
		if(isVegetarian()){
			System.out.print("(V)");
		}
		System.out.println(" "+getPrice());
		System.out.println("  --"+getDescription());
	}

}
