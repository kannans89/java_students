package com.techlabs.collections.crud;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
	private static  Set<Integer> integerSet;
	public static void main(String[] args) {
		
		integerSet = new LinkedHashSet<Integer>();
		
		addElements(integerSet);
		updateElement(integerSet);
		updateElement(integerSet);
		deleteElement(integerSet);
		deleteElement(integerSet);
		readElement(integerSet);
		deleteAll(integerSet);
		deleteElement(integerSet);
		
	}
	public static void addElements(Set<Integer> setToAdd) {
		System.out.println("{Create - < C > }");
		System.out.println("Elements added to the Set");
		setToAdd.add(114);
		setToAdd.add(639);
		setToAdd.add(12);
		setToAdd.add(10);
		setToAdd.add(14);
		setToAdd.add(114);
		setToAdd.add(14);
		System.out.println("Elements in Set are :- " + setToAdd);
		System.out
				.println("========================================================");
		/*
		 * System.out.println("Trying for Each :-"); for(Integer currentElement
		 * : setToAdd){ System.out.println("Element :- "+currentElement); }
		 */
	}
	//read
	public static void readElement(Set<Integer> setToRead) {
		System.out.println("{Read - < CR > }");
		if(setToRead.isEmpty()){
			System.out.println("No Elements in the Set to Display");
			System.out.println("========================================================");

		} else {
			System.out.println("Elements in the List :-"+setToRead);
			System.out.println("========================================================");

		}
	}


	// Update
	public static void updateElement(Set<Integer> setToUpdate) {
		System.out.println("{Update - < CRU > }");
		if (setToUpdate.contains(12)) {
			setToUpdate.remove(12);
			setToUpdate.add(21);
			System.out.println("Elements in Set after Update are :- "
					+ setToUpdate);
			System.out
					.println("========================================================");

		} else {
			System.out.println("Element not Present ");
			System.out
					.println("========================================================");
		}
	}

	// Delete
	public static void deleteElement(Set<Integer> setToDeleteFrom) {
		System.out.println("{Delete - < CRUD > }");
		if (setToDeleteFrom.isEmpty()) {
			System.out.println("No Elements in the Set to Delete");
		} else {
			setToDeleteFrom.remove(13);
			System.out.println("Element in the Set :- " + setToDeleteFrom);
		}

	}

	public static void deleteAll(Set<Integer> setToDelete) {
		System.out.println("{Delete - < CRUD > }");
		if (setToDelete.isEmpty()) {
			System.out.println("No elements To delete");
		} else {
			setToDelete.clear();
			System.out.println("All Elements in the List Deleted ");
			System.out.println("List is :- " + setToDelete);
			System.out.println("===========================================");
		}
	}


}
