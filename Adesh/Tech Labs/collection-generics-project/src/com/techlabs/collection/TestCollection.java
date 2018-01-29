package com.techlabs.collection;

import java.util.ArrayList;

public class TestCollection {

	public static void main(String[] args) {

		LineItem item = new LineItem(1, "adesh", 2000, 5);
		System.out.println(item.getTotalPrice());

		ArrayList<Object> myList = new ArrayList<Object>();

		myList.add(new LineItem(01, "kannan", 4000, 6));
		myList.add(new LineItem(02, "rahul", 6000, 3));
		myList.add(new LineItem(03, "leena", 2000, 7));
		// myList.add("hello");

		for (Object x : myList) {
			LineItem currentItem = (LineItem) x;
			System.out.println("id is = " + currentItem.getId()
					+ ", Price is = " + currentItem.getTotalPrice());
		}
	}

}
