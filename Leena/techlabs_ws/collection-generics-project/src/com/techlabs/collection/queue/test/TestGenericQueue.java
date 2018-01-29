package com.techlabs.collection.queue.test;
import java.util.Iterator;
import com.techlabs.collection.queue.GenericQueue;

public class TestGenericQueue {

	public static void main(String[] args) {
		
		GenericQueue<String> stringQueue=new GenericQueue<String>();
		
		stringQueue.push("A");
		stringQueue.push("B");
		stringQueue.push("C");
		stringQueue.push("D");
		
		System.out.println("After push : ");
		//printQueuewithfor(stringQueue);
		printQueuewithforeach(stringQueue);
		
		System.out.println();
		System.out.println("===========================");
		
		stringQueue.pop();
		
		System.out.println("After pop : ");
		//printQueuewithfor(stringQueue);
		printQueuewithforeach(stringQueue);
		
		
	}
	
	private static void printQueuewithfor(GenericQueue<String> queue){
		for(Iterator<String> cursor=queue.iterator(); cursor.hasNext();){
			System.out.print(cursor.next());
			
		}
	}
	
	private static void printQueuewithforeach(GenericQueue<String> queue){
		for(String item:queue){
			System.out.print(item);
		}
	}

}
