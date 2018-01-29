package com.techlabs.collections.crud;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.collections.crud.exceptions.NoElementPresentException;

public class TestArrayList {
	private static List<Integer> integerList;

	public static void main(String[] args) {
		integerList = new ArrayList<Integer>();

		try {
			readList(integerList);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("===========================================");
		}

		addElement(integerList);

		try {
			readList(integerList);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("===========================================");
		}

		updateList(integerList);
		updateList(integerList);
		deleteElementInList(integerList);
		deleteElementInList(integerList);
		deleteAll(integerList);

	}

	// Create ('C' in CRUD)
	public static void addElement(List<Integer> listToAdd) {
		System.out.println("{Create - < C > }");
		System.out.println("Elements Added to the List");
		listToAdd.add(10);
		listToAdd.add(15);
		listToAdd.add(7);
		listToAdd.add(20);
		System.out.println("Elements in the List are :- " + listToAdd);
		System.out.println("===========================================");
	}

	// Read or Select ('R' in CRUD)
	public static void readList(List<Integer> listToRead)
			throws NoElementPresentException {
		System.out.println("{Read - < CR > }");

		if (listToRead.isEmpty()) {
			throw new NoElementPresentException(listToRead);
		} else {
			int firstPosition = listToRead.get(0);
			System.out.println("Element at First Position :-" + firstPosition);
			int thirdPosition = listToRead.get(2);
			System.out.println("Element at Third Position :-" + thirdPosition);
			System.out.println("===========================================");
		}
	}

	// Update('U' in CRUD)
	public static void updateList(List<Integer> listToUpdate) {
		System.out.println("{Update - < CRU > }");
		if (listToUpdate.contains(7)) {
			int indexOfElement = listToUpdate.indexOf(7);
			listToUpdate.set(indexOfElement,17 );
			/*listToUpdate.remove(indexOfElement);
			listToUpdate.add(indexOfElement, 17);*/ // add overload version add an
													// element to a specified
													// location
			System.out.println("Elements after Update :- " + listToUpdate);
			System.out.println("===========================================");
		} else {
			System.out.println("Element not present in the List");
			System.out.println("===========================================");

		}
	}

	// Delete('D' in CRUD)
	public static void deleteElementInList(List<Integer> listToRemoveFrom) {
		System.out.println("{Delete - < CRUD > }");

		if (listToRemoveFrom.isEmpty()) {
			System.out.println("NO Elements to Delete");
		} else {
			if (listToRemoveFrom.contains(15)) {
				int indexOfElement = listToRemoveFrom.indexOf(15);
				System.out.println("Index of Item to remove is :-"
						+ indexOfElement);
				listToRemoveFrom.remove(indexOfElement);
				System.out.println("Elements in the List are :- "
						+ listToRemoveFrom);
				System.out
						.println("===========================================");
			} else {
				System.out.println("Element Not Present in the List");
				System.out
						.println("===========================================");

			}
		}
	}

	public static void deleteAll(List<Integer> listToDelete) {
		System.out.println("{Delete - < CRUD > }");
		if (listToDelete.isEmpty()) {
			System.out.println("No elements To delete");
		} else {
			listToDelete.clear();
			System.out.println("All Elements in the List Deleted ");
			System.out.println("List is :- " + listToDelete);
			System.out.println("===========================================");
		}
	}

}
