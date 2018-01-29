package com.swabhav.techlabs.generic;

import java.util.Iterator;
import java.util.LinkedList;

import com.swabhav.stack.StackEmptyException;

public class SwabhavQ<T> implements Iterable<T>{
private LinkedList<T> list;
public SwabhavQ()
{
	list=new LinkedList<T>();
}
	public void enqueue(T data)
	{
		list.add(data);
	}
	public T dequeue()
	{
		if(!list.isEmpty())
		{
			T data=list.removeFirst();
			return data;
		}
		else
			throw new QueueEmptyException(this);
	}
	public int getSize()
	{
		return list.size();
	}
	public LinkedList<T> getData()
	{
		if(list.size()!=0)
			return list;
		else
			throw new QueueEmptyException(this);
	}
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}
	
	

}
