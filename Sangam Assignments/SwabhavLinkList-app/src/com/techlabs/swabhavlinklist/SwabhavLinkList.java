package com.techlabs.swabhavlinklist;

import java.util.Iterator;

public class SwabhavLinkList<T> implements Iterable<T> {
	private Node<T> first;
	private Node<T> last;
	private int size;

	public SwabhavLinkList() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (size==0) 
		{
			last = newNode;
			first = newNode;
		} 
		else 
		{
			Node<T> currentLastNode = last;
			last = newNode;
			currentLastNode.setNextNode(last);
		}
		size++;
	}

	public int getSize() {
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		return new SwabhavLinkedListIterator();
	}

	private class SwabhavLinkedListIterator implements Iterator<T> {
		private Node<T> currentNode = first;
		@Override
		public boolean hasNext() {
			return (currentNode != null);
		}

		@Override
		public T next() {
			T data = null;
			if (hasNext())
				data = currentNode.getData();
			currentNode = currentNode.getNextNode();

			return data;
		}

	}

}