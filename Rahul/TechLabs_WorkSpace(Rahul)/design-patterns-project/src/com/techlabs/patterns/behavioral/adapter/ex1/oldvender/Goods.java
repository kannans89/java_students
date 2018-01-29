package com.techlabs.patterns.behavioral.adapter.ex1.oldvender;

public class Goods {
	//Ivars
	
	private int goodsID;
	private String goodsName;
	private int goodsQuantity;
	private double goodsPrice;
	
	//Construtor
	public Goods(int id,String name,int quantity,double price){
		goodsID = id;
		goodsName = name;
		goodsQuantity = quantity;
		goodsPrice = price;		
	}
	
	//Methods

	public int getGoodsID() {
		return goodsID;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public int getGoodsQuantity() {
		return goodsQuantity;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public double getTotalPrice(){
		return getGoodsPrice()*getGoodsQuantity();
	}
	
	public double getDiscount(){
		return getTotalPrice()* (60.0/100);
	}
	
	
	
	

}
