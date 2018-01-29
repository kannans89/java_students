package com.techlabs.patterns.creational.singleton.ex2;

public enum AnimalType {
	LION(true), TIGER(true), CAT(false), DOG(true), FISH(false), DEER(false);
	private boolean isCarnivorous = false;

	private AnimalType(boolean value) {
		this.isCarnivorous = value;
	}

	public boolean chaeckCarnivorous() {
		return this.isCarnivorous;
	}
}