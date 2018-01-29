package com.techlabs.sorting.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.sorting.LineItem;
import com.techlabs.sorting.NameComparator;

public class TestNameComparator {

	public static void main(String[] args) {
		ArrayList<LineItem> myList = new ArrayList<LineItem>();
		myList.add(new LineItem("Book", 5, 2, 100));
		myList.add(new LineItem("Laptop", 1, 3, 20000));
		myList.add(new LineItem("Tablet", 3, 8, 12000));
		myList.add(new LineItem("apple", 4, 4, 8000));

		Collections.sort(myList, new NameComparator());

		System.out.println(myList);
	}

}
