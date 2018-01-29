package com.techlabs.crud;

public class TestLinkHashSet {

	public static void main(String[] args) {

		CrudLinkedHashSet clh=new CrudLinkedHashSet();
		clh.addElement(1);
		clh.addElement(50);
		clh.addElement(200);
		clh.addElement(10);
		clh.addElement(300);
		clh.updateElement(10, 111);
		System.out.println(clh.myLinkedHashSet);
	}

}
