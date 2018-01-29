package com.techlabs.crud;

import java.util.ArrayList;
import java.util.List;

public class CrudArrayList {
	List<Integer> myList=new ArrayList<Integer>();
	
	public void addElement(Integer element)
	{
		myList.add(element);
	}

	public void removeElement(int index)
	{
		myList.remove(index);
		
	}
	
	public void updateElement(Integer element,Integer newElement)
	{
		int index=myList.indexOf(element);
		myList.remove(element);
		myList.add(index, newElement);
		
		
	}
}
