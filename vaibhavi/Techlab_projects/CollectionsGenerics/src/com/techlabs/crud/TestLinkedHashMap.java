package com.techlabs.crud;

public class TestLinkedHashMap {

	public static void main(String[] args) {

		CrudLinkedHashMap map=new CrudLinkedHashMap();
		map.addElement(50, "fifty");
		map.addElement(2, "two");
		map.addElement(3, "three");
		System.out.println(map.m);
		map.deleteElement(2);
		System.out.println(map.m);
		map.updateElement(3, "four");
		System.out.println(map.m);
		
	}

}
