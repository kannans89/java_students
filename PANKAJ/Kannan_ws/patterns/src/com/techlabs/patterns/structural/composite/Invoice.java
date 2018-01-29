package com.techlabs.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Invoice implements IOrderComponent {

	List<IOrderComponent> list;
	String desc;

	public Invoice(String desc) {
		this.desc = desc;
		list = new ArrayList<IOrderComponent>();
	}

	public void add(IOrderComponent component) {
		list.add(component);
	}

	@Override
	public void displayInfo() {
		System.out.println("Printing invoice details:" + desc);
		for (IOrderComponent temp : list) {
			temp.displayInfo();
		}

	}

}
