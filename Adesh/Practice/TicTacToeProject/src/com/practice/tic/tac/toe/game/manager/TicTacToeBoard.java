package com.practice.tic.tac.toe.game.manager;

import java.util.HashSet;
import java.util.Set;

import com.practice.tic.tac.toe.board.printer.BoardPrinter;

public class TicTacToeBoard {
	BoardPrinter printer = new BoardPrinter();
	public boolean result = false;
	public boolean win = false;
	private static int size = 3;
	private char[][] board = new char[size][size];
	private Set<String> validCells;
	
	public TicTacToeBoard(){
		validCells = new HashSet<String>();
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				board[row][column] = ' ';
				validCells.add(row+""+column);
			}
		}
	}
	
	public void print(){
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				System.out.println(board[row][column] = ' ');
			}
		}
	}

	public boolean checkValidity(String[][] matrix, int rows, int cols, String player) {
		if ((matrix[rows][cols] == "X") || (matrix[rows][cols] == "O")) {
			System.out.println("This move is not valid. Please try again...");
			return result = true;
		} else {
			// printer.printMatrix(matrix);
			//System.out.println("continue");
			return result = false;
		}
	}

	public boolean checkMatch(String[][] matrix, String player) {
		if ((matrix[0][0] == player && matrix[0][1] == player && matrix[0][2] == player)
				|| (matrix[1][0] == player && matrix[1][1] == player && matrix[1][2] == player)
				|| (matrix[2][0] == player && matrix[2][1] == player && matrix[2][2] == player)) {
			System.out.println("player " + player + " won!congrats!");
			win = true;
			System.out.println(win);
			//isWon();
			return win;
		} else if ((matrix[0][0] == player && matrix[1][0] == player && matrix[2][0] == player)
				|| (matrix[0][1] == player && matrix[1][1] == player && matrix[2][1] == player)
				|| (matrix[0][2] == player && matrix[1][2] == player && matrix[2][2] == player)) {
			System.out.println("player " + player + " won!congrats!");
			win = true;
			System.out.println(win);
			//isWon();
			return win;
		} else if ((matrix[0][0] == player && matrix[1][1] == player && matrix[2][2] == player)
				|| (matrix[0][2] == player && matrix[1][1] == player && matrix[2][0] == player)) {
			System.out.println("player " + player + " won!congrats!");
			win = true;
			System.out.println(win);
			//isWon();
			return win;
		} else {
			win = false;
			System.out.println("not win anyone yet ");
			//isWon();
			return win;
		}
	}

	public boolean isWon() {
		System.out.println(win);
		return win;
	}

	public boolean isValid() {
		if (result == true) {
			return true;
		} else {
			return false;
		}
	}

}
