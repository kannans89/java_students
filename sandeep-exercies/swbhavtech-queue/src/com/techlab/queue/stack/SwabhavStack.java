package com.techlab.queue.stack;

import java.util.*;

import com.techlab.queue.student.Student;

public class SwabhavStack<T> implements Iterable<T> {
	private LinkedList<T> list = new LinkedList<T>();

	public void push(T e) {

		list.addFirst(e);
	}

	public T pop() {
		T e = list.removeFirst();
		return e;
	}

	public T peek() {
		return list.getLast();
	}

	public boolean search(T e) {

		if (!list.contains(e)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public Iterator<T> iterator() {

		return list.iterator();
	}

}
