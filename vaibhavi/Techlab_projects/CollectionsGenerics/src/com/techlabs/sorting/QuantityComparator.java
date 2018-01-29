package com.techlabs.sorting;

import java.util.Comparator;

import com.techlabs.collections.old.*;

public class QuantityComparator implements Comparator<LineItem>{

	@Override
	public int compare(LineItem item1, LineItem item2) {
		if(item1.getQuantity()>item2.getQuantity())
		{
		return 1;
		}
		else if(item1.getQuantity()<item2.getQuantity())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
