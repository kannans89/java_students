package com.techlabs.pattern.structural.adaptor.ex1.test;
import com.techlabs.pattern.structural.adaptor.ex1.newvendor.IDiscountable;
import com.techlabs.pattern.structural.adaptor.ex1.oldvendor.Goods;

public class GoodsAdaptor implements IDiscountable{
	
	private Goods goods;
	
	public GoodsAdaptor(Goods goods){
		this.goods=goods;
	}
	
	@Override
	public double calculateDiscount(){
		return goods.getDiscount();
	}
	
	@Override
	public String getProductDescription(){
		return "Total price for "+goods.getName()+" is :";
				
	}
}
