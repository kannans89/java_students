package com.practice.tic.tac.toe.test;

import com.practice.tic.tac.toe.game.manager.GameManager;

public class TestTicTacToeGame {

	public static void main(String[] args) {
		GameManager game = new GameManager();
		game.startGame();
		game.finishGame();
	}

}
