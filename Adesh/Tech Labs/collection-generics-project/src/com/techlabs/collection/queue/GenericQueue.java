package com.techlabs.collection.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericQueue<T> implements Iterable<T> {
	private LinkedList<T> myQueue;

	public GenericQueue() {
		myQueue = new LinkedList<T>();
	}

	public void push(T item) {
		myQueue.addLast(item);
	}

	public void pop() {
		myQueue.removeFirst();
	}

	public Iterator<T> iterator() {
		return myQueue.iterator();
	}

}
