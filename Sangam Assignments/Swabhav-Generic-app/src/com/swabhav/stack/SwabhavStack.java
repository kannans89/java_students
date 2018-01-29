package com.swabhav.stack;

import java.util.Iterator;
import java.util.LinkedList;
public class SwabhavStack<T> implements Iterable<T>{
	private LinkedList<T> list;
	public SwabhavStack()
	{
		list=new LinkedList<T>();
	}
		public void push(T data)
		{
			list.add(data);
		}
		public T pop()
		{
			if( !list.isEmpty() )
			{
				return list.removeLast();
			}
			else
				throw new StackEmptyException(this);
		}
		public int getSize()
		{
			return list.size();
		}
		public boolean search(T data)
		{
			if(list.contains(data))
					return true;
			else
					return false;
		}
		@Override
		public Iterator<T> iterator() {
			
			return list.iterator();
		}
		
		



}
