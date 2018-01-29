package com.techlabs.player;

public class Test {

	public static void main(String[] args) {
		Player one = new Player(1, "adesh", 27);
		Player two = new Player(2, "kannan", 30);
		Player elder = one.findElderPlayer(two);

		System.out.println(one);
		System.out.println(two);
		System.out.println(elder);
		printPlayer(elder);
		System.out.println(one.toString());
		System.out.println(one.hashCode());
		printPlayer(one);
		printPlayer(two);

	}

	private static void printPlayer(Player player) {
		System.out.println(player.getId());
		System.out.println(player.getName());
		System.out.println(player.getAge());
	}

}
