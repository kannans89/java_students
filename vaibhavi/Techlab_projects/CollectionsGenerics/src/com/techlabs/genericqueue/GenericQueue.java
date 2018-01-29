package com.techlabs.genericqueue;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericQueue<T> implements Iterable<T> {

	LinkedList<T> list=new LinkedList<T>();
	
	public void push(T element)
	{
		list.addLast(element);
	}
	public void pull()
	{
		list.removeFirst();
	}
	@Override
	public String toString() {
		return "GenericQueue [list=" + list + "]";
	}
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}
}