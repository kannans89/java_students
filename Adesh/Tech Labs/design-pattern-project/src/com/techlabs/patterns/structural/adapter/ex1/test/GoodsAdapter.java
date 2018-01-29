package com.techlabs.patterns.structural.adapter.ex1.test;

import com.techlabs.patterns.structural.adapter.ex1.newvendor.IDiscountable;
import com.techlabs.patterns.structural.adapter.ex1.oldvendor.Goods;

public class GoodsAdapter implements IDiscountable {

	private Goods goods;
	
	public GoodsAdapter(int id, String name, double quantity, double price){
		goods = new Goods(id, name, quantity, price);
	}
	public double calculateDiscount() {
		return goods.getDiscount();
	}
	public void getDescription() {
		System.out.println("Name = "+goods.getName());
		System.out.println("Total price = "+goods.getPrice());
	}

}
