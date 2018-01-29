package com.techlab.node;


public class Node<T> {
    private Node<T> next;
    private T data;
	public Node(Node<T> next, T data) {
		super();
		this.next = next;
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	
	public T getData() {
		return data;
	}
	
}
