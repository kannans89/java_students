package com.techlabs.set;

import java.util.Comparator;

import com.techlab.LineItem.LineItem;

public class CompareByName implements Comparator<LineItem> {
	public int compare(LineItem o1, LineItem o2) {
		return o1.getName().compareTo(o2.getName());

	}
}
