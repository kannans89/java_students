package com.techlabs.crud;

import java.util.Set;

public class SetCRUD<E> {

	Set<E> elements;

	public void addElement(E i) {
		elements.add(i);
	}

	public void updateElement(E oldE, E newE) {
		if (elements.contains(oldE)) {
			elements.remove(oldE);
			elements.add(newE);
		}
	}

	public void deleteElement(E i) {
		if (elements.contains(i)) {
			elements.remove(i);
		}
	}

	public Set<E> read() {
		return elements;
	}

}
