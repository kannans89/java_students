package com.practice.chapter4.simple.factory;

import com.practice.chapter4.factory.method.Pizza;

public class ClamPizza extends Pizza {

	public ClamPizza(){
		name = "deep dish clam pizza";
		dough = "Extra thin crust Dough";
		sauce = "garlic sauce";
		
		toppings.add("randen clam");
	}
}
