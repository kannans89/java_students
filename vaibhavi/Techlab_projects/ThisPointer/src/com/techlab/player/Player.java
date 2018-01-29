package com.techlab.player;

public class Player {

	private int id;
	private int age;
	private String name;
	
	public Player(int id,int age,String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
	
	public Player getElderPlayer(Player player)
	{
		if(this.age>player.age)
		{
			return this;
		}
		else
		{
			return player;
		}
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", age=" + age + ", name=" + name
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode();
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
