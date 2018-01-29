package com.techlabs.collections;

public class LineItem {
	private int id;
	private String productname;
	private int quantity;
	private double price;
	
	public LineItem(int id,String productname,int quantity,double price){
		this.id=id;
		this.productname=productname;
		this.quantity=quantity;
		this.price=price;
	}

	public int getID(){
		return id;
	}
	
	public String getName(){
		return productname;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double getPrice(){
		return price;
	}
	
	public double getTotalprice() {
		
		return (this.quantity*this.price);
		
	}
}
