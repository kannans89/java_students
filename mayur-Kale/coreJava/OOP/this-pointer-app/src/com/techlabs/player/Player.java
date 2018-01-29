package com.techlabs.player;

public class Player {

	int id;
	String name;
	int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println(System.identityHashCode(this));
	}

	public Player getElderPlayer(Player other) {
		if (this.age > other.age)
			return this;
		else
			return other;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
