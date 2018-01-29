package com.techlabs.set;
import java.util.Comparator;

import com.techlab.LineItem.LineItem;

public class CompareByPrice implements Comparator<LineItem> {
	public int compare(LineItem o1, LineItem o2) {
		if (o1.getPrice() > (o2.getPrice()))
			return 1;
		if (o1.getPrice() < o2.getPrice())
			return -1;
		else
			return 0;
	}
}
