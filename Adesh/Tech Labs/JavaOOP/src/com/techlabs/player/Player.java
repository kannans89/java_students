package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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

	public Player findElderPlayer(Player other) {
		if (this.age > other.age) {
			return this;
		}// else{
		return other;
		// }
	}

	@Override
	public String toString() {
		String info = "id is= " + this.id + "\n" + "name is= " + this.name
				+ "\n" + "age is= " + this.age;
		return info + "\nsuperclass toString() = " + super.toString();
	}

	@Override
	public int hashCode() {
		return this.id;
	}

}
