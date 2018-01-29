package com.techlabs.collection.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericQueue<T> implements Iterable<T>/**/ {
	
	private LinkedList<T> queue;
	
	public GenericQueue(){
		queue=new LinkedList<T>();
	}
	
	public void push(T item){
		queue.addLast(item);
	}
	
	public void pop(){
		queue.removeFirst();
	}
	
	//@Override
	public Iterator<T> iterator(){
		return queue.iterator();
	}
}
