package com.practice.tic.tac.toe.game.manager;

import com.practice.tic.tac.toe.board.printer.BoardPrinter;

public class TicTacToeBoard {
	BoardPrinter printer = new BoardPrinter();
	public boolean result = false;
	public boolean win = false;

	public boolean checkValidity(String[][] matrix, int rows, int cols, String p) {
		if ((matrix[rows][cols] == "X") || (matrix[rows][cols] == "O")) {
			System.out.println("This move is not valid. Please try again...");
			return result = true;
		} else {
			// printer.printMatrix(matrix);
			System.out.println("chalo aage");
			return result = false;
		}
	}

	public boolean checkMatch(String[][] matrix, String p) {
		if ((matrix[0][0] == p && matrix[0][1] == p && matrix[0][2] == p)
				|| (matrix[1][0] == p && matrix[1][1] == p && matrix[1][2] == p)
				|| (matrix[2][0] == p && matrix[2][1] == p && matrix[2][2] == p)) {
			System.out.println("player " + p + " won!congrats!");
			win = true;
			System.out.println(win);
			isWon();
			return win;
		} else if ((matrix[0][0] == p && matrix[1][0] == p && matrix[2][0] == p)
				|| (matrix[0][1] == p && matrix[1][1] == p && matrix[2][1] == p)
				|| (matrix[0][2] == p && matrix[1][2] == p && matrix[2][2] == p)) {
			System.out.println("player " + p + " won!congrats!");
			win = true;
			System.out.println(win);
			isWon();
			return win;
		} else if ((matrix[0][0] == p && matrix[1][1] == p && matrix[2][2] == p)
				|| (matrix[0][2] == p && matrix[1][1] == p && matrix[2][0] == p)) {
			System.out.println("player " + p + " won!congrats!");
			win = true;
			System.out.println(win);
			isWon();
			return win;
		} else {
			win = false;
			System.out.println("not win anyone yet " + win);
			isWon();
			return win;
		}
	}

	public boolean isWon() {
		if (win == true) {
			System.out.println(win);
			return true;
		} else {
			System.out.println(win);
			return false;
		}
	}

	public boolean isValid() {
		if (result == true) {
			return true;
		} else {
			return false;
		}
	}

	
}
