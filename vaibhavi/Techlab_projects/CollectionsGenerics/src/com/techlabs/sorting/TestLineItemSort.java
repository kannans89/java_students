package com.techlabs.sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.collections.old.LineItem;

public class TestLineItemSort {
	public static void main(String[] args) {

		List<LineItem> items=new ArrayList<LineItem>();
		LineItem li1=new LineItem("Book",2, 2, 6500);
		LineItem li2=new LineItem("Laptop",1, 3, 2500);
		LineItem li3=new LineItem("abc", 3, 4, 522);
		
		items.add(li1);
		items.add(li2);
		items.add(li3);
		System.out.println("Before sorting"+items);
		
		Collections.sort(items);
		System.out.println("After sorting"+items);
		System.out.println("After sorting quantity");
		Collections.sort(items, new QuantityComparator());
		System.out.println(items);
		System.out.println("After sorting unit price");
		Collections.sort(items, new PriceComparator());
		System.out.println(items);
		System.out.println("After sorting names");
		Collections.sort(items, new NameComparator());
		System.out.println(items);
		

}
}
