package com.techlabs.gamerunner;

import com.techlabs.board.Board;
import com.techlabs.input.InputFromPlayer;
import com.techlabs.player.Player;

public class GameRunner {
	Board gameBoard = new Board(4,4);
	Player player1 = new Player("Rahul", 'X');
	Player player2 = new Player("Mayur", 'O');
	InputFromPlayer input = new InputFromPlayer();

	public void run() {

		gameBoard.setUp();
		System.out.println(gameBoard);

		while (!gameBoard.isFull()) {

			// ---->> Player 1

			playerTurn(player1);

			boolean status1 = gameBoard.checkWin(player1);
			if (status1)
				break;
			if (gameBoard.isFull())
				break;

			// --->>> Player 2

			playerTurn(player2);
			boolean status2 = gameBoard.checkWin(player2);
			if (status2)
				break;

			if (gameBoard.isFull())
				break;

		}
		if (gameBoard.isFull() && !gameBoard.checkWin(player1) && !gameBoard.checkWin(player2) ) {
			System.out.println("Draw");
		}
	}

	public void playerTurn(Player currentPlayer) {
		boolean updateStatus = false;
		while (!updateStatus) {
			int[] inputOfPlayer1 = input.getInput(currentPlayer);
			boolean statusCheck1 = gameBoard.updateBoard(inputOfPlayer1[0],
					inputOfPlayer1[1], inputOfPlayer1[2]);
			if (statusCheck1) {
				updateStatus = true;
				System.out.println("\nBoard Updated :\t" + gameBoard);
			} else {
				continue;
			}
		}

	}

}
