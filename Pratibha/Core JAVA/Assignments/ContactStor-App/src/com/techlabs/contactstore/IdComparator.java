package com.techlabs.contactstore;
import java.util.*;

@SuppressWarnings("rawtypes")
public class IdComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Contact c1=(Contact)o1;
		Contact c2=(Contact)o2;
		
		if(c1.getId()==c2.getId())
			return 0;
		else if(c1.getId()>c2.getId())
			return 1;
		else
			return -1;
	}

}
