package com.techlabs.collections.comparetosort;

import java.util.Comparator;

import com.techlabs.collections.LineItem;

public class ProductIdcompare implements Comparator<LineItem>{

	@Override
	public int compare(LineItem lineItemObj1, LineItem LineItemObj2) {
		
		 if(lineItemObj1.getProductID()== LineItemObj2.getProductID()){
			 return 0;
		}
		 else if(lineItemObj1.getProductID() > LineItemObj2.getProductID())
		 {
			 return 1;
		 }
		 else{
			 return -1;
		 }
		
	}

}
