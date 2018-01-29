package com.practice.tic.tac.toe.game.manager;

import java.util.Scanner;

public class GameHelper {
	private GameManager game;

	public GameHelper(GameManager game) {
		this.game = game;
	}

	public GameHelper() {
	}

	public void restartGame() {
		System.out.println("you want to play again..?\nyes or no");
		Scanner in = new Scanner(System.in);
		//String answer = in.nextLine();
		if (in.nextLine() == "yes") {
			 game.startGame();
		} else {
			System.out.println("Thanks for playing..!");
		}
	}
}
