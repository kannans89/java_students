package com.techlabs.sorting;

import java.util.Comparator;

public class PriceComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem item1, LineItem item2) {
		if(item1.getUnitPrice()<item2.getUnitPrice())
			return 1;
		else if(item1.getUnitPrice()>item2.getUnitPrice())
			return -1;
		return 0;
	}
	

}
