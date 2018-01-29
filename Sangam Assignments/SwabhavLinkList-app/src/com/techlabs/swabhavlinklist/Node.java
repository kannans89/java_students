package com.techlabs.swabhavlinklist;

public class Node<T> {
	private Node<T> next;
	private T data;

	public Node(T data) {
		this.next = null;
		this.data = data;
	}

	public Node<T> getNextNode() {
		return next;
	}

	public void setNextNode(Node<T> node) {
		this.next = node;
	}

	public T getData() {
		return data;
	}
}