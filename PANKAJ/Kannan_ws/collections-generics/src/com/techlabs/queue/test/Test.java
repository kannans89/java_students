package com.techlabs.queue.test;

import java.util.Iterator;

import com.techlabs.queue.GenericQueue;

public class Test {

	public static void main(String[] args) {

		GenericQueue<String> myQueue = new GenericQueue<String>();

		myQueue.push("A");
		myQueue.push("B");
		myQueue.push("C");

		Iterator<String> i = myQueue.getIterator();
		print(i);

		myQueue.pop();

		i = myQueue.getIterator();
		print(i);
	}

	static void print(Iterator<String> i) {
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
