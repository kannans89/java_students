package com.techlabs.crud;

import java.util.LinkedHashMap;

public class CrudLinkedHashMap {

   LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();
   public void addElement(Integer key,String value )
	{
		m.put(key,value);
	}
   public void deleteElement(Integer key)
	{
		m.remove(key);
		
		
	}
   public void updateElement(Integer key,String newValue)
	{
		if(m.containsKey(key))
		{
			m.put(key, newValue);
		}
	}
}
