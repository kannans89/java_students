package com.techlabs.set;

import java.util.Comparator;

import com.techlab.LineItem.LineItem;

public class CompareById implements Comparator<LineItem> {
	public int compare(LineItem o1, LineItem o2) {
		if (o1.getId() > (o2.getId()))
			return 1;
		if (o1.getId() < o2.getId())
			return -1;
		else
			return 0;
	}
}