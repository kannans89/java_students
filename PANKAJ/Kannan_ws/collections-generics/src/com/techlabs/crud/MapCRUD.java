package com.techlabs.crud;

import java.util.Map;

public class MapCRUD<K, V> {

	Map<K, V> elements;

	public void addElement(K key, V value) {
		elements.put(key, value);
	}

	public void updateElement(K key, V value) {
		if (elements.containsKey(key)) {
			elements.put(key, value);
		}
	}

	public void deleteElement(K key) {
		if (elements.containsKey(key)) {
			elements.remove(key);
		}
	}

	public Map<K, V> read() {
		return elements;
	}

	@Override
	public String toString() {
		return "[elements=" + elements + "]";
	}

}
