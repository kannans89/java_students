package com.techlabs.collection.test;

import java.util.ArrayList;

import com.techlabs.collection.LineItem;

public class TestGenerics {

	public static void main(String[] args) {
		
		ArrayList<LineItem> order = new ArrayList<LineItem>();
		order.add(new LineItem(1, "Football", 3, 1000));
		order.add(new LineItem(3, "Cricket Ball", 1, 800));
		order.add(new LineItem(3, "Volley ball", 3, 400));

		for (LineItem item : order)
			System.out.println(item.getQuantity() + " " + item.getName()
					+ " costs:" + item.calcTotalPrice());
	}

}
