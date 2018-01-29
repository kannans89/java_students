package com.practice.patterns.structural.adapter.ex1.oldvendor;

import com.practice.patterns.structural.adapter.ex1.newvendor.IDiscountable;

public class GoodsAdapter implements IDiscountable{

	private Goods goods;
	
	public GoodsAdapter(int id, String name, double quantity, double price){
		goods = new Goods(id, name, quantity, price);
	}
	
	public double calculateDiscount() {
		return goods.getDiscount();
	}

	public void getDescription() {
		System.out.println("Goods id = "+goods.getId());
		System.out.println("Goods name = "+goods.getName());
		System.out.println("Goods Quantity = "+goods.getQuantity());
		System.out.println("Total price = "+goods.getPrice());
	}

}
