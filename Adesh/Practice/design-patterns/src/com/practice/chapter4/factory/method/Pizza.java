package com.practice.chapter4.factory.method;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList toppings = new ArrayList();
	
	public void prepare(){
		System.out.println("preparing "+name);
		System.out.println("tossing dough..");
		System.out.println("Adding sauce..");
		System.out.println("Adding toppings..");
		for(int i=0;i<toppings.size();i++){
			System.out.println(" "+toppings.get(i));
		}
	}
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut(){
		System.out.println("cutting the pizza in the diagonal slices");
	}
	
	public void box(){
		System.out.println("place pizza in official pizzastore box");
	}
	
	public String getName(){
		return name;
	}
}
