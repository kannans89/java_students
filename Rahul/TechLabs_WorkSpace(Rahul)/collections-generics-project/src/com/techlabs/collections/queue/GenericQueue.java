package com.techlabs.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericQueue<T> implements Iterable<T> {
	// Instance variables
	private LinkedList<T> queue;

	// constructor
	public GenericQueue() {
		queue = new LinkedList<T>();
	}

	public void push(T itemTopush) {
		queue.addLast(itemTopush);
	}
	public void pop(){
		queue.removeFirst();
	}
	@Override
	public Iterator<T> iterator(){
		Iterator<T> cursor;
		cursor = queue.iterator();
		return cursor;
	}
	

}
