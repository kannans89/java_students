package com.techlabs.patterns.creational.singleton.ex2;

public enum AnimalType {

	LION(true), TIGER(true), COW(false), GIRRAF(false);

	// ivars
	private boolean isCarnivorous;
	private boolean isHarbivorous;

	// constructor
	private AnimalType(boolean value) {
		isCarnivorous = value;
		isHarbivorous = value;
	}

	public boolean isCarnivorous() {
		return isCarnivorous;
	}

	public boolean isHarbivorous() {
		return !isHarbivorous;
		
	}
}
