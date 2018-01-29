package player;

public class Player {
	private String name;
	private int age;
	private int id;

	public Player(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	boolean equals(Player p) {

		if (p == this)
			return true;
		if ((this.name == p.name) && (this.age == p.age) && (this.id == p.id)) {
			return true;

		} else
			return false;
	}
}
