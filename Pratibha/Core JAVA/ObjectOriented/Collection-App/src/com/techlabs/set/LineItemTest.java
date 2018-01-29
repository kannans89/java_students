package com.techlabs.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.techlab.LineItem.*;

public class LineItemTest{

	public static void main(String[] args) {
		Set<LineItem> li1 = new HashSet();
		li1.add(new LineItem(2, "Mango", 5, 20));
		li1.add(new LineItem(1, "Banana", 6, 1));
		li1.add(new LineItem(4, "Orange", 3, 100));
		printInfo(li1);
		System.out.println();

		Set<LineItem> li2 = new LinkedHashSet<LineItem>();
		li2.add(new LineItem(2, "Mango", 5, 20));
		li2.add(new LineItem(1, "Banana", 6, 1));
		li2.add(new LineItem(4, "Orange", 3, 100));
		printInfo(li2);
		System.out.println();
		Set<LineItem> li3 = new TreeSet<LineItem>();
		li3.add(new LineItem(2, "Mango", 5, 20));
		li3.add(new LineItem(1, "Banana", 6, 1));
		li3.add(new LineItem(4, "Orange", 3, 100));
		
		printInfo(li3);
		
		
	}

	public static void printInfo(Set<LineItem> set) {
		for (LineItem o : set) {
			System.out.println(o.getId() + "  " + o.getName() + " "
					+ o.getQuantity() + "  " + o.getPrice());
		}
		
	}
	

	
}