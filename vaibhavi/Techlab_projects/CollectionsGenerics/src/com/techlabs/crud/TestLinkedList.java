package com.techlabs.crud;

public class TestLinkedList {

	public static void main(String[] args) {

		CrudLinkedList list=new CrudLinkedList();
		list.addItems(1);
		list.addItems(20);
		list.addItems(8);
		list.addItems(15);
	     list.addAtfirst(100);
	     list.removeAtLast();
	     list.update(100, 111);
		System.out.println(list);

		
	}

}
