package playerTest;

import player.*;

@SuppressWarnings("unused")
public class PlayerTest {

	private String name;
	private int age;
	private int id;

	PlayerTest(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public static void main(String[] args) {

		PlayerTest p1 = new PlayerTest("Virat", 29, 2);
		Player p2 = new Player("Sachine", 45, 1);
		Player p3 = new Player("Sachine", 45, 1);

		System.out.println("p2==p3" + (p2 == p3));
		System.out.println("p1.equals(p2)=" + p1.equals(p2));
		System.out.println("p2.equals(p3)=" + p2.equals(p3));
	}

}