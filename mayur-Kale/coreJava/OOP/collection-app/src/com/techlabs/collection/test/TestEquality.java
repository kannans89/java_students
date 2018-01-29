package com.techlabs.collection.test;

import com.techlabs.collection.LineItem;

public class TestEquality {

	public static void main(String[] args) {
		LineItem item1 = new LineItem(1, "Mayur", 1, 1000);
		LineItem item2 = new LineItem(1, "Mayur", 1, 1000);

		if (item1.equals(item2))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
