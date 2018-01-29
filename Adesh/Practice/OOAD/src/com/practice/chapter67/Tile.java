package com.practice.chapter67;

import java.util.LinkedList;
import java.util.List;

public class Tile {
	private List units;
	
	public Tile(){
		units = new LinkedList();
	}
	
	protected void addUnit(Unit unit){
		units.add(unit);
	}
	
	protected void removeUnit(Unit unit){
		units.remove(unit);
	}

	public void removeUnits() {
	}

	public List getUnits() {
		return null;
	}
}
