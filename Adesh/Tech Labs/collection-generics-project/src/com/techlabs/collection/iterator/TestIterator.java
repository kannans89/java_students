package com.techlabs.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.collection.LineItem;

public class TestIterator {

	public static void main(String[] args) {
		List<LineItem> myList = new ArrayList<LineItem>();

		myList.add(new LineItem(101, "adesh", 3000, 3));
		myList.add(new LineItem(105, "kannan", 6000, 1));
		myList.add(new LineItem(102, "rahul", 200, 7));
		myList.add(new LineItem(107, "leena", 7000, 2));
		myList.add(new LineItem(103, "aditi", 4000, 3));

		for (Iterator<LineItem> i = myList.iterator(); i.hasNext();) {
			LineItem item = i.next();
			System.out.println("Id is = " + item.getId()
					+ ", total price is = " + item.getTotalPrice());
		}

	}

}
