package com.practice.tic.tac.toe.game.manager;

import com.practice.tic.tac.toe.player.Player;
import com.practice.tic.tac.toe.player.Players;

public class GameManager extends Player {

	Players player1;
	Players player2;
	TicTacToeBoard board;
	public GameManager(){
		player1 = new Players("Player 'O'", 'O');
		player2 = new Players("Player 'X'", 'X');
		board = new TicTacToeBoard();
	}
	public boolean win = false;

	public void startGame() {
		System.out.println("Welcome to the Tic Tac Toe game:\n");
		do {
			//player.getPlayer1Input();
			if(board.isWon())break;
			//player.getPlayer2Input();
			
			
		} while (!board.isWon());

	}

	public void finishGame() {
		if (board.isWon() != win) {
			System.out.println("game over");
			System.out.println("=================");
		}
	}

}
