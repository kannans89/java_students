package com.techlabs.generic.linklist;

public class Node<T> {
	 T item;
	 Node<T> next;
	 Node<T> prev;

	Node(Node<T> prev, T element, Node<T> next) {
		this.item = element;
		this.next = next;
		this.prev = prev;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	

	
}