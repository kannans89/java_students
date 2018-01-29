package com.techlabs.collections.set.test;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.collections.invoice.LineItem;

public class TestSetsWithNonPrimitive {
	public static void main(String args[]) {

		Set<LineItem> cart = new HashSet<LineItem>();

		cart.add(new LineItem("books", 1, 5, 100));
		cart.add(new LineItem("books", 1, 5, 100));
		cart.add(new LineItem("mobile", 3, 5, 10000));

		System.out.println("Printing distinct LineItems:");
		for (LineItem li : cart) {
			System.out.println(li);
		}
	}

}
