package com.techlabs.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericQueue<E>{

	LinkedList<E> aList = new LinkedList<E>();
	
	public void push(E element) {
		aList.addLast(element);
	}

	public void pop() {
		aList.removeFirst();
	}

	public Iterator<E> getIterator() {
		return aList.iterator();
	}

}
