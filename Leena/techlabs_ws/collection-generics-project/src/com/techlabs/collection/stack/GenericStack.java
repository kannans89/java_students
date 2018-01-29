package com.techlabs.collection.stack;
import java.util.Iterator;
import java.util.LinkedList;

public class GenericStack<T> implements Iterable<T> {
		
		private LinkedList<T> stack;
		
		public GenericStack(){
			stack=new LinkedList<T>();
		}
		
		public void push(T item){
			stack.addLast(item);
		}
		
		public void pop(){
			stack.removeFirst();
		}
		
		//@Override
		public Iterator<T> iterator(){
			return stack.iterator();
		}
	}


