package com.techlabs.collections.new_list;

import java.util.ArrayList;

import com.techlabs.collections.old.LineItem;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<LineItem> cart=new ArrayList<LineItem>();
		cart.add(new LineItem("Laptops", 1, 5, 25000));
		cart.add(new LineItem("Books",2,5,500));
		
		for(LineItem items:cart)
		{
			System.out.printf("Name is %s Total price is %s", items.getName(),items.calculateTotalprice());
		}
		
	}

}
