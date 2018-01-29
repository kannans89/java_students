package com.techlabs.sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem item1, LineItem item2) {

	   return item1.getName().toLowerCase().compareTo(item2.getName().toLowerCase());
	}

}
