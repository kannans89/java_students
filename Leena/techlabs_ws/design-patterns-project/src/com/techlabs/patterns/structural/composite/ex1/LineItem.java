package com.techlabs.patterns.structural.composite.ex1;

public class LineItem implements IOrderComponents{
	
	private int id;
	private String name;
	private int quantity;
	private int price;
	
	public LineItem(int id,String name,int quantity,int price){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	
	public int getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}

	public int getTotalPrice(){
		return this.quantity*this.price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	@Override
	public void printOrderDetails(){
		System.out.println("LineItem is printing ");
		System.out.println("ID is :"+getID()+ " "+getName()+ " phone"+" quantity is :"+getQuantity()+" You have to pay : :"+getTotalPrice());
	}
	
}
