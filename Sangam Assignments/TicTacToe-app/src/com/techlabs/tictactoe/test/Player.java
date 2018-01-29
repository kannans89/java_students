package com.techlabs.tictactoe.test;

import java.util.Scanner;

public class Player {
	private String playerName;
	private int cellNo;
	private Scanner sc;

	public Player(String name) {
		this.playerName = name;
	}

	public String getName() {
		return playerName;
	}

	public String nextMove() {
		sc = new Scanner(System.in);
		System.out.print(this.getName() + " Turn : ");
		cellNo = sc.nextInt();
		return "" + cellNo;
	}
}
