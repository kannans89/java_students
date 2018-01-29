package com.techlabs.crud;

import java.util.HashSet;

public class HashSetCRUD<E> extends SetCRUD<E> {

	public HashSetCRUD() {
		elements = new HashSet<E>();
	}

}
