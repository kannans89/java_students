package com.techlabs.tictactoe.board;

public class Board {

	char board[][] = new char[3][3];
	Mark mark;

	public void setBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	}

	public boolean isBoardFull() {
		boolean isFull = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					isFull = false;
				}
			}
		}
		return isFull;
	}

	public boolean checkForWin() {
		return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
	}

	private boolean checkRowsForWin() {

		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
				return true;
			}
		}
		return false;
	}

	private boolean checkColumnsForWin() {

		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
				return true;
			}
		}
		return false;
	}

	private boolean checkDiagonalsForWin() {

		return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(
				board[0][2], board[1][1], board[2][0]) == true));

	}

	private boolean checkRowCol(char c1, char c2, char c3) {

		return ((c1 != '-') && (c1 == c2) && (c2 == c3));

	}

	public boolean placeMark(char currentPlayerMark,int row, int col) {

		
		if ((row >= 0) && (row < 3)) {

			if ((col >= 0) && (col < 3)) {

				if (board[row][col] == '-') {

					board[row][col] = currentPlayerMark;

					return true;

				}
			}
		}

		return false;

	}

}
