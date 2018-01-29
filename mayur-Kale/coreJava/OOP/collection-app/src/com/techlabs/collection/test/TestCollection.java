package com.techlabs.collection.test;

import java.util.ArrayList;

import com.techlabs.collection.LineItem;

public class TestCollection {

	public static void main(String[] args) {
		ArrayList order = new ArrayList();
		order.add(new LineItem(1, "Football", 3, 1000));
		order.add(new LineItem(3, "Cricket Ball", 1, 800));
		order.add(new LineItem(3, "Volley ball", 3, 400));
		order.add("hello");

		for (Object box : order) {
			LineItem item = (LineItem) box;
			System.out.println(item.getQuantity() + " " + item.getName()
					+ " costs:" + item.calcTotalPrice());
		}
	}
}
