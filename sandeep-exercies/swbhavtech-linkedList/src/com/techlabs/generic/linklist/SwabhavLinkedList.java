package com.techlabs.generic.linklist;

import java.util.Iterator;

import com.techlabs.generic.linklist.Node;

public class SwabhavLinkedList<T> implements Iterable<T> {

	public int size = 0;
	Node<T> first;
	Node<T> last;

	public void addFirst(T e) {
		Node<T> f = first;
		Node<T> newNode = new Node<>(null, e, f);
		first = newNode;
		if (f == null)
			last = newNode;
		else
			f.setPrev(newNode);
		size++;
	}

	public void add(T e) {
		Node<T> l = last;
		Node<T> newNode = new Node<>(l, e, null);
		last = newNode;
		if (l == null)
			first = newNode;
		else
			l.setNext(newNode);
		size++;

	}

	@Override
	public Iterator<T> iterator() {

		return new ListIterator();
	}

	public class ListIterator implements Iterator<T> {
		private Node<T> currentNode = first;

		@Override
		public boolean hasNext() {

			return currentNode != null;
		}

		@Override
		public T next() {
			T item = null;

			if (hasNext())
				item = currentNode.item;
			currentNode = currentNode.getNext();

			return item;
		}

	}

}
