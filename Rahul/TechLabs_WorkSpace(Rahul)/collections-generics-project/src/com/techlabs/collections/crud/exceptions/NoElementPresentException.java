package com.techlabs.collections.crud.exceptions;

import java.util.List;

public class NoElementPresentException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoElementPresentException(List<Integer> listToRead) {
		listOfIntegers = listToRead;
	}

	@Override
	public String getMessage() {
		System.out
				.println("******************************** < Note > ****************************************");
		return "List Does Not Contain Any Elements to Display";

	}

	public List<Integer> getlistOfIntegers() {
		return listOfIntegers;
	}

	// Instance Variables
	private List<Integer> listOfIntegers;
}
