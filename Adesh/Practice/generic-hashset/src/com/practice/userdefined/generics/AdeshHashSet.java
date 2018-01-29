package com.practice.userdefined.generics;

import java.util.HashMap;
import java.util.Map;

public class AdeshHashSet<T> {
	private String V = null;
	private Map<T, String> map;

	public AdeshHashSet() {
		map = new HashMap<T, String>();
	}

	public void add(T text) {
		map.put(text, V);
	}

	@Override
	public String toString() {
		return "keys are = "+map.keySet()+" and values are = "+map.values();
	}
}
