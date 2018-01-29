package com.practice.patterns.structural.composite.ex1;


public class LineItem implements IOrderComponent{
	private int id;
	private String name;
	private int quantity;
	
	public LineItem(int id, String name, int quantity){
		this.id = id;
		this.name= name;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void printOrderDetails() {
		System.out.println("\nid is = "+getId());
		System.out.println("name is = "+getName());
		System.out.println("quantity is = "+getQuantity());
	}

}
