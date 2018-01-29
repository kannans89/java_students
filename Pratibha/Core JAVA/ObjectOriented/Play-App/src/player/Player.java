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

	public Player whoIsElder(Player p) {
		if (this.age > p.age)
			return this;
		else
			return p;
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
}
