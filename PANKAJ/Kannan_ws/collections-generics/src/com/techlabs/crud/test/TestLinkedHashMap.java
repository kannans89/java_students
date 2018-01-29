package com.techlabs.crud.test;

import com.techlabs.crud.LinkedHashMapCRUD;

public class TestLinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMapCRUD<Integer,String> aLinkedHashMap=new LinkedHashMapCRUD<Integer,String>();
		
		aLinkedHashMap.addElement(50, "fifty");
		aLinkedHashMap.addElement(2, "two");
		aLinkedHashMap.addElement(100, "hundred");
		aLinkedHashMap.addElement(4, "four");
		aLinkedHashMap.addElement(5, "five");
		
		System.out.println(aLinkedHashMap.read());
		
		aLinkedHashMap.updateElement(2, "two again");
		
		System.out.println(aLinkedHashMap.read());
		
		aLinkedHashMap.deleteElement(100);
		System.out.println(aLinkedHashMap.read());
	}

}
