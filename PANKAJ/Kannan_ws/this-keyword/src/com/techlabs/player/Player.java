package com.techlabs.player;

public class Player {
	private int id;
	private int age;
	private String name;

	public Player(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public Player getElderPlayer(Player p) {
		if (this.age > p.age)
			return this;
		else
			return p;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*@Override
	public boolean equals(Object obj) {
		Player p=(Player)obj;
		if(this.name==p.name)
			if(this.id==p.id)
				if(this.age==p.age)
	}*/
}
