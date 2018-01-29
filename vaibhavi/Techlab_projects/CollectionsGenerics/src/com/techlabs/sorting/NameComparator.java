package com.techlabs.sorting;

import java.util.Comparator;

import com.techlabs.collections.old.LineItem;

public class NameComparator implements Comparator<LineItem>{

	@Override
	public int compare(LineItem item1, LineItem item2) {
		return item1.getName().toUpperCase().compareTo(item2.getName().toUpperCase());
	}

}
