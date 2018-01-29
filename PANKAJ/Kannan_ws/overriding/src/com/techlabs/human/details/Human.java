package com.techlabs.human.details;

public class Human {
	private String name;
	private int height;
	private int weight;

	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
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
		height++;
	}

	public void eat() {
		weight++;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ").append(name).append("\nHeight :").append(height)
				.append("\nWeight :").append(weight);

		return sb.toString();
	}

}
