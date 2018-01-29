package com.techlabs.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.collections.invoice.LineItem;

public class Test {

	public static void main(String[] args) {

		List<LineItem> item = new ArrayList<LineItem>();

		item.add(new LineItem("Book", 1, 5, 100));
		item.add(new LineItem("Mobile", 2, 4, 10000));
		item.add(new LineItem("Laptop", 3, 2, 20000));

		for (Iterator<LineItem> i = item.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}

	}

}
