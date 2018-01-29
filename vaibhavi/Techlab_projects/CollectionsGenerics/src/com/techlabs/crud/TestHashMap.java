package com.techlabs.crud;

public class TestHashMap {

	public static void main(String[] args) {

		CrudHashMap map=new CrudHashMap();
		map.addElement(100, "hunded");
		map.addElement(2, "two");
		map.addElement(3, "three");
		System.out.println(map.myHashMap);
		map.deleteElement(3);
		System.out.println(map.myHashMap);
		map.updateElement(100, "four");
		System.out.println(map.myHashMap);
	}

}
