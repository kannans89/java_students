package com.techlabs.crud;

import java.util.LinkedHashSet;
import java.util.Set;

public class CrudLinkedHashSet {
	
   Set<Integer> myLinkedHashSet=new LinkedHashSet<Integer>();
   
   public void addElement(Integer element)
	{
	   myLinkedHashSet.add(element);
	}
	
   public void removeElement(Integer element)
	{
	   myLinkedHashSet.remove(element);
    }
   
   public void updateElement(Integer element,Integer newElement)
   {
	  if( myLinkedHashSet.contains(element))
	   {
		  
		   removeElement(element);
		   addElement(newElement);
	   }
   }
}