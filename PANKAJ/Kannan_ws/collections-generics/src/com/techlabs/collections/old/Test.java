package com.techlabs.collections.old;

import java.util.ArrayList;

import com.techlabs.collections.invoice.LineItem;

public class Test {

	public static void main(String[] args) {

		ArrayList cart = new ArrayList();
		cart.add(new LineItem("books", 1, 5, 100));
		cart.add(new LineItem("laptop", 2, 1, 20000));
		cart.add(new LineItem("mobile", 3, 5, 10000));
		cart.add("Hello");
		cart.add(new Integer(10));

		for (Object obj : cart) {
			LineItem item = (LineItem) obj;
			System.out.println("Name is " + item.getName() + " and price is: "
					+ item.calcTotalPrice());

		}
	}

}
