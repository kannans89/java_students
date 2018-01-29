package com.techlab.LineItem;

import java.util.Set;
import java.util.TreeSet;

import com.techlabs.set.CompareById;
import com.techlabs.set.CompareByName;
import com.techlabs.set.CompareByPrice;

class LineitemTreeSet {
	public static void main(String[] args) {
		Set<LineItem> li3 = new TreeSet<LineItem>(new CompareByName());
		li3.add(new LineItem(2, "Mango", 5, 20));
		li3.add(new LineItem(1, "Banana", 6, 1));
		li3.add(new LineItem(4, "Orange", 3, 100));
		
		printInfo(li3);
		System.out.println();
		
		Set<LineItem> li4 = new TreeSet<LineItem>(new CompareById());
		li4.add(new LineItem(2, "Mango", 5, 20));
		li4.add(new LineItem(1, "Apple", 6, 1));
		li4.add(new LineItem(4, "Banana", 3, 100));
		
		printInfo(li4);
		System.out.println();

		Set<LineItem> li5 = new TreeSet<LineItem>(new CompareByPrice());
		li5.add(new LineItem(2, "Mango", 5, 200));
		li5.add(new LineItem(1, "Banana", 6, 1));
		li5.add(new LineItem(4, "Orange", 3, 100));
		
		printInfo(li5);
		System.out.println();
		
	}

	public static void printInfo(Set<LineItem> set) {
		for (LineItem o : set) {
			System.out.println(o.getId() + "  " + o.getName() + " "
					+ o.getQuantity() + "  " + o.getPrice());
		}

	}
}