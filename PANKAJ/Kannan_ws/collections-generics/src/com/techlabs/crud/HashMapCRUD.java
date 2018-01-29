package com.techlabs.crud;

import java.util.HashMap;

public class HashMapCRUD<K, V> extends MapCRUD<K, V> {

	public HashMapCRUD() {
		elements = new HashMap<K, V>();
	}
}
