package com.techlabs.collections.old;

import java.util.ArrayList;

public class Test {

 public static void main(String[] args)
 {
	ArrayList cart=new ArrayList(); 
	cart.add(new LineItem("books", 1, 5, 50));
	cart.add(new LineItem("Laptops", 2, 5, 25000));
	cart.add("Hello");
	cart.add(new Integer(10));
	
	for(Object item:cart)
	{
		LineItem obj=(LineItem)(item);
		System.out.printf("Name is %s Total price is %s", obj.getName(),obj.calculateTotalprice());
	}
 }
}
