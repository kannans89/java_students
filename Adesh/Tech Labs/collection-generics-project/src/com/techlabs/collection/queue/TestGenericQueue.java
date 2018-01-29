package com.techlabs.collection.queue;

import java.util.Iterator;

public class TestGenericQueue {

	public static void main(String[] args) {
		GenericQueue<String> queue = new GenericQueue<String>();

		queue.push("adesh");
		queue.push("pote");
		queue.push("rahul");
		queue.push("kannan");

		System.out.println("Before popping ======>");
		print(queue);
		queue.pop();
		queue.push("leena");

		System.out.println("After popping ======>");
		print(queue);

	}

	private static void print(GenericQueue<String> queue) {
		for (Iterator<String> i = queue.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

}
