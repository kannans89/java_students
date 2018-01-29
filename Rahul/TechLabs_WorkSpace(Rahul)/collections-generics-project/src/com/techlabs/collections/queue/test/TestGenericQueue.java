package com.techlabs.collections.queue.test;

import com.techlabs.collections.queue.GenericQueue;

public class TestGenericQueue {
	public static void main(String[] args) {
		GenericQueue<String> stringQueueObject = new GenericQueue<String>();
		//GenericQueue<Integer> integerQueueObject = new GenericQueue<Integer>();
		stringQueueObject.push("Hi there this is my first statement");
		stringQueueObject.push("Hi this is my Second statement");
		stringQueueObject.push("Hi This is my third Statement");
		stringQueueObject.push("Hi there this is my Fourth statement");
		stringQueueObject.push("Hi this is my Fifth statement");
		stringQueueObject.push("Hi This is my Sixth Statement");
		for(String currentitem : stringQueueObject ){
			System.out.println("Before Pop :- "+currentitem);
		}
		/*for(Iterator<String> cursor = stringQueueObject.iterator();cursor.hasNext();){
			System.out.println("Before Pop :- "+cursor.next());
		}*/
		stringQueueObject.pop();
		stringQueueObject.pop();
		for(String currentitem : stringQueueObject ){
			System.out.println("After Pop :- "+currentitem);
		}
		
		
		/*for(Iterator<String> cursor = stringQueueObject.iterator();cursor.hasNext();){
			System.out.println("After Pop :-"+cursor.next());
		}*/
	}
}
