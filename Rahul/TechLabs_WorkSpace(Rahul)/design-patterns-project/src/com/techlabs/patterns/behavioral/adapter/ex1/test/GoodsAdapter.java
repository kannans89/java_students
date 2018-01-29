package com.techlabs.patterns.behavioral.adapter.ex1.test;

import com.techlabs.patterns.behavioral.adapter.ex1.newvender.IDiscountable;
import com.techlabs.patterns.behavioral.adapter.ex1.oldvender.Goods;

public class GoodsAdapter implements IDiscountable{
	
	//Ivars
	Goods goods;
	
	//Constructor
	public GoodsAdapter(int id,String name,int quantity,double price){
		goods = new Goods(id, name, quantity, price);
	}

	@Override
	public double calculateDiscount() {
		
		return goods.getDiscount();
	}

	@Override
	public String getProductName() {
		
		return goods.getGoodsName();
	}
	
	

}
