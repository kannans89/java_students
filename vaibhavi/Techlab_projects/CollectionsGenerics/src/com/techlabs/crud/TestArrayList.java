package com.techlabs.crud;

public class TestArrayList {
	

	public static void main(String[] args) {

		CrudArrayList c=new CrudArrayList();
		c.addElement(10);
	    c.addElement(100);
		c.addElement(50);
		c.addElement(1);
		c.addElement(20);
		c.addElement(300);
		c.updateElement(1, 111);
		c.removeElement(4);
		System.out.println(c.myList);
		
		
		
	}
	


}
