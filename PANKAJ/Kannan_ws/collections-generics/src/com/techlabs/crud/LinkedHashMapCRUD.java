package com.techlabs.crud;

import java.util.LinkedHashMap;

public class LinkedHashMapCRUD<K, V> extends MapCRUD<K, V> {

	public LinkedHashMapCRUD() {
		elements = new LinkedHashMap<K, V>();
	}

}
