package com.techlabs.crud;

import java.util.HashMap;

public class CrudHashMap {

	HashMap<Integer,String> myHashMap=new HashMap<Integer,String>();
	
	public void addElement(Integer key,String value )
	{
		myHashMap.put(key,value);
	}
	
	public void deleteElement(Integer key)
	{
		myHashMap.remove(key);
	}
	
	public void updateElement(Integer key,String newValue)
	{
		if(myHashMap.containsKey(key))
		{
			myHashMap.put(key, newValue);
		}
	}
}
