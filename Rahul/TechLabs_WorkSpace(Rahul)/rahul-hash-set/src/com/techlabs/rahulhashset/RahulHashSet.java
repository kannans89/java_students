package com.techlabs.rahulhashset;

import java.util.HashMap;
import java.util.Map;

public class RahulHashSet<T> {
	//Instance variable
	private String dummy;
	private Map<T,String> hashSet;
	
	//constructor
	public RahulHashSet(){
	hashSet = new HashMap<T,String>();
	}
	public void add(T toAdd){
		hashSet.put(toAdd, dummy);
		
	}
	@Override
	public String toString() {
		
		return "hashSet :" + hashSet;
	}
	

}
