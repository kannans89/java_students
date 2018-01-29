package com.techlabs.tictactoe.board;

public class Mark {
	char currentPlayerMark = 'x';

	public void changePlayer() {

		if (currentPlayerMark == 'x') {
			currentPlayerMark = 'o';
		} else {
			currentPlayerMark = 'x';
		}
	}

	public char getCurrentPlayerMark() {
		return currentPlayerMark;
	}

}
