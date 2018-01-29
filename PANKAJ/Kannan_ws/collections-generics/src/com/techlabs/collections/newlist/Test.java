package com.techlabs.collections.newlist;

import java.util.ArrayList;

import com.techlabs.collections.invoice.LineItem;

public class Test {

	public static void main(String[] args) {

		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem("Book", 1, 5, 100));
		cart.add(new LineItem("Mobile", 2, 4, 10000));
		cart.add(new LineItem("Laptop", 3, 2, 20000));

		for (LineItem item : cart) {
			System.out.println("Name is " + item.getName() + " and Price is "
					+ item.calcTotalPrice());
		}

	}

}
