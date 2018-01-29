package com.techlabs.crud.test;

import com.techlabs.crud.HashSetCRUD;

public class TestHashSet {

	public static void main(String[] args) {

		HashSetCRUD<Integer> aHashSet = new HashSetCRUD<Integer>();

		aHashSet.addElement(10);
		aHashSet.addElement(60);
		aHashSet.addElement(40);
		aHashSet.addElement(50);
		aHashSet.addElement(100);
		
		System.out.println(aHashSet.read());

		aHashSet.updateElement(60, 61);
		System.out.println(aHashSet.read());

		aHashSet.deleteElement(10);
		System.out.println(aHashSet.read());
	}

}
