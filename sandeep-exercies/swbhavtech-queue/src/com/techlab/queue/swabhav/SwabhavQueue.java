package com.techlab.queue.swabhav;

import java.util.Iterator;
import java.util.LinkedList;

public class SwabhavQueue<T> implements Iterable<T>{
	private LinkedList<T> list = new LinkedList<T>();

	public void enqueue(T element) {
		list.add(element);
	}

	public T dequeue() {
		return list.remove();
	}

	public T get() {

		return list.getFirst();
	}

	public void clear() {
		list.clear();
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	
	public Iterator<T> iterator() {
		return list.iterator();
	}

}
