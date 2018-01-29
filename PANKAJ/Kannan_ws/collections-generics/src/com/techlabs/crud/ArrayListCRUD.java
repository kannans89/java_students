package com.techlabs.crud;

import java.util.ArrayList;

public class ArrayListCRUD<E> {

	ArrayList<E> numbers = new ArrayList<E>();

	public void addElement(E i) {
		numbers.add(i);
	}

	public void updateElement(E oldE,E newE) {
		if (numbers.contains(oldE)) {
			numbers.add(numbers.indexOf(oldE), newE);
			numbers.remove(numbers.indexOf(oldE));
		}
	}
	
	public void deleteElement(E i){
		if (numbers.contains(i)) {
			numbers.remove(numbers.indexOf(i));
		}
	}
	
	public ArrayList<E> read(){
		return numbers;
	}

}
