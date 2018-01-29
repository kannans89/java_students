package com.techlabs.crud.test;

import com.techlabs.crud.ArrayListCRUD;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayListCRUD<Integer> aList = new ArrayListCRUD<Integer>();

		aList.addElement(10);
		aList.addElement(50);
		aList.addElement(60);
		aList.addElement(40);
		aList.addElement(100);
		
		System.out.println(aList.read());
		
		aList.updateElement(60, 61);
		System.out.println(aList.read());

		aList.deleteElement(100);;
		System.out.println(aList.read());
	}
}
