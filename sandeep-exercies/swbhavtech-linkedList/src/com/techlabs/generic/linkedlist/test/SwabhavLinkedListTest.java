package com.techlabs.generic.linkedlist.test;


import com.techlabs.generic.linklist.*;

public class SwabhavLinkedListTest {
	public static void main(String[] args) {
		
		SwabhavLinkedList<Integer> list = new SwabhavLinkedList<Integer>();
		list.add(5);
		list.add(6);
		list.add(8);
		printInfo(list);
		
		list.addFirst(10);
		printInfo(list);
		
		System.out.println("Size: "+list.size);
		
	}
	
	public static void printInfo(SwabhavLinkedList<Integer> list){
		for(int i:list){
			System.out.println(i);
		}System.out.println();
	}
}
