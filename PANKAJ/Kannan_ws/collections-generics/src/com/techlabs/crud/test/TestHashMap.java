package com.techlabs.crud.test;

import com.techlabs.crud.HashMapCRUD;

public class TestHashMap {

	public static void main(String[] args) {

		HashMapCRUD<Integer,String> aHashMap=new HashMapCRUD<Integer,String>();
		
		aHashMap.addElement(50, "fifty");
		aHashMap.addElement(2, "two");
		aHashMap.addElement(100, "hundred");
		aHashMap.addElement(4, "four");
		aHashMap.addElement(5, "five");
		
		System.out.println(aHashMap.read());
		
		aHashMap.updateElement(2, "two again");
		System.out.println(aHashMap);
		
		aHashMap.deleteElement(5);
		System.out.println(aHashMap);
			
	}

}
