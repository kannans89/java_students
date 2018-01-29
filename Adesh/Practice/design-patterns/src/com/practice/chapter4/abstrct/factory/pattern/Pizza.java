package com.practice.chapter4.abstrct.factory.pattern;

import java.util.Arrays;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggie veggie[];
	protected Cheese cheese;
	protected PepperOni pepperOni;
	protected Clam clam;
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut(){
		System.out.println("cutting the pizza in the diagonal slices");
	}
	
	public void box(){
		System.out.println("place pizza in official pizzastore box");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce
				+ ", veggie=" + (veggie != null ? Arrays.asList(veggie) : null)
				+ ", cheese=" + cheese + ", pepperOni=" + pepperOni + ", clam="
				+ clam;
	}

}
