package com.techlabs.pattern.structural.adaptor.ex1.oldvendor;

public class Goods {
	
	private int id;
	private String name;
	private int quantity;
	private double price;
	
	public Goods(int id,String name,int quantity,double price){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	
	public double calculateTotalPrice(){
		//System.out.println(" for old vendor you are having 60% discount");
		return (this.quantity*this.price);
	}
	
	public double getDiscount(){
		return calculateTotalPrice()*0.60;
	}
	
	public int getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double getPrice(){
		return price;
	}
	
	
}
