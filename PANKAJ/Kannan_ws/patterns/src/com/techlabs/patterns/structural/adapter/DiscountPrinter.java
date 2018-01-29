package com.techlabs.patterns.structural.adapter;

public class DiscountPrinter {
	
	public void print(IDiscount obj){
		System.out.println("Discount is:"+obj.getDiscount());
	}

}
