package com.techlabs.crud;

public class TestHashSet {

	public static void main(String[] args) {
		
		CrudHashSet hashset=new CrudHashSet();
		hashset.addElement(10);
		hashset.addElement(100);
		hashset.addElement(50);
		hashset.addElement(1);
		hashset.addElement(200);
		hashset.addElement(300);
		hashset.addElement(300);
		System.out.println(hashset.mySet);
		
		hashset.removeElement(300);
		System.out.println(hashset.mySet);
		
		hashset.updateElement(100, 111);
		System.out.println(hashset.mySet);
		

	}

}
