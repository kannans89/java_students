package com.techlabs.crud;

import java.util.HashSet;

public class CrudHashSet {

	HashSet<Integer> mySet=new HashSet<Integer>();
	
	public void addElement(Integer element)
	{
		mySet.add(element);
	}
	
	public void removeElement(Integer element)
	{
		mySet.remove(element);
	}
	
	public void updateElement(Integer element,Integer newElement)
	{
		if(mySet.contains(element))
		{
			removeElement(element);
			addElement(newElement);
		}
	}
	
}
