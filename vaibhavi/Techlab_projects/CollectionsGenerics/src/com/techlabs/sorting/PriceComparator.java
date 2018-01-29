package com.techlabs.sorting;
import java.util.Comparator;

import com.techlabs.collections.old.LineItem;

public class PriceComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem item1, LineItem item2) {
		// TODO Auto-generated method stub
		if(item1.getUnitprice()>item2.getUnitprice())
		{
		return -1;
		}
		else if(item1.getUnitprice()<item2.getUnitprice())
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}

}
