package com.techlabs.sorting;

import java.util.Comparator;

public class QuantityComparator implements Comparator<LineItem>{	

	
	@Override
	public int compare(LineItem firstQty, LineItem secondQty) {
		if(firstQty.getQty() < secondQty.getQty())
			return -1;
		else if(firstQty.getQty()>secondQty.getQty())
			return 1;
		else
		return 0;
	}
	
}
