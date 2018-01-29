package com.techlibs.human;

public class Human {
	private int id;
	private String name;
	private int height;
	private int weight;

	public Human(int pId, String pName, int pHeight, int pWeight) {
		id = pId;
		name = pName;
		height = pHeight;
		weight = pWeight;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void play() {
		weight = weight - 3;
		height = height - 1;
	}
}
