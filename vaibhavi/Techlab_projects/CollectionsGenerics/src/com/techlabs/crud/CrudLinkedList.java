package com.techlabs.crud;

import java.util.LinkedList;

public class CrudLinkedList {

	LinkedList<Integer> linkedList=new LinkedList<Integer>();
	
	public void addAtfirst(Integer item)
	{
		linkedList.addFirst(item);
	}
	
	public void addItems(Integer item)
	{
		linkedList.add(item);
	}
	
	public void removeAtLast()
	{
		linkedList.removeLast();
	}
	public void removeItem(Integer item )
	{
		linkedList.remove(item);
	}
	
	public void update(Integer item1,Integer item2)
	{
		int index=linkedList.indexOf(item1);
		linkedList.remove(index);
		linkedList.add(index, item2);
	}
	@Override
	public String toString() {
		return "CrudLinkedList [linkedList=" + linkedList + "]";
	}
	
}
