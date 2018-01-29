package com.techlabs.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestGenerics {
	public static void main(String[] args) {

		List<LineItem> myList = new ArrayList<LineItem>();

		LineItem lineItem1 = new LineItem(101, "adesh", 5000, 7);
		LineItem lineItem2 = new LineItem(102, "adesh", 4000, 1);
		LineItem lineItem3 = new LineItem(103, "rahul", 7000, 3);

		if (lineItem1.equals(lineItem2)
				&& lineItem1.hashCode() == lineItem2.hashCode()) {
			System.out
					.println("both references are reffering to two objects that are equal");
		}

		myList.add(lineItem1);
		myList.add(lineItem2);
		myList.add(lineItem3);

		// System.out.println(myList);
		//Collections.sort(myList);
		// System.out.println(myList);

		HashSet<LineItem> mySet = new HashSet<LineItem>();
		mySet.addAll(myList);
		// System.out.println(mySet);

		for (LineItem x : mySet) {
			System.out.println("id is = " + x.getId() + ", total price is = "
					+ x.getTotalPrice());
		}

	}

}
