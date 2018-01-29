package com.techlabs.set.lineitem;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestLineItem {
	public static void main(String[] args) {
		Set<LineItem> items;
		items = new TreeSet<LineItem>(new Comparator<LineItem>() {

			@Override
			public int compare(LineItem o1, LineItem o2) {
				// TODO Auto-generated method stub
				if(o1.getId()>o2.getId())
				return 1;
				else
					if(o1.getId()<o2.getId())
					return -1;
					else return 0;
				
			}
		});

		items.add(new LineItem(1, "Football", 1, 100));
		items.add(new LineItem(2, "Football", 1, 100));
		items.add(new LineItem(3, "Cricket ball", 1, 300));
		display(items);
	}

	private static void display(Set<LineItem> items) {
		for (LineItem lineItem : items) {
			System.out.println(lineItem.getId() + ":" + lineItem.getName()
					+ ":" + lineItem.calcTotalPrice());
		}
	}
}
