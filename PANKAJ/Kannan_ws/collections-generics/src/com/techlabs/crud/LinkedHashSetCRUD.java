package com.techlabs.crud;

import java.util.LinkedHashSet;

public class LinkedHashSetCRUD<E> extends SetCRUD<E> {

	public LinkedHashSetCRUD() {
		elements = new LinkedHashSet<E>();
	}
}
