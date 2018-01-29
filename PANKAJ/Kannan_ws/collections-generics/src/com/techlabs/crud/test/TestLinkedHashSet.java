package com.techlabs.crud.test;

import com.techlabs.crud.LinkedHashSetCRUD;

public class TestLinkedHashSet {
	public static void main(String args[]) {

		LinkedHashSetCRUD<Integer> aLinkedHashSet = new LinkedHashSetCRUD<Integer>();

		aLinkedHashSet.addElement(10);
		aLinkedHashSet.addElement(20);
		aLinkedHashSet.addElement(5);
		aLinkedHashSet.addElement(50);
		aLinkedHashSet.addElement(100);

		System.out.println(aLinkedHashSet.read());

		aLinkedHashSet.updateElement(50, 51);
		System.out.println(aLinkedHashSet.read());

		aLinkedHashSet.deleteElement(100);
		System.out.println(aLinkedHashSet.read());
	}

}
