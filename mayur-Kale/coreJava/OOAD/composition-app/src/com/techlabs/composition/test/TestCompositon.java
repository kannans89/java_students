package com.techlabs.composition.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.techlabs.composition.LineItem;
import com.techlabs.composition.Order;
import com.techlabs.composition.Product;

public class TestCompositon {

	public static void main(String[] args) {

		Product p1 = new Product(1, "Football", 500, 10);
		Product p2 = new Product(2, "Volley ball", 200, 30);
		Product p3 = new Product(3, "Cricket ball", 100, 5);
		List<LineItem> items = new ArrayList<LineItem>();

		items.add(new LineItem(1, 3, p1));
		items.add(new LineItem(2, 5, p2));
		items.add(new LineItem(3, 10, p3));
		Order order = new Order(100, Calendar.getInstance().getTime(), items);
		System.out.println(order);
	}

}
