package com.swabhav.techlabs.generic.test;

import com.swabhav.techlabs.generic.SwabhavQ;

public class SwabhavQTest {

	public static void main(String[] args) {

		
		SwabhavQ<Integer> queue=new SwabhavQ<Integer>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
		System.out.println(queue.getData());
		System.out.println("Queue size = "+queue.getSize());
		
	}
}
