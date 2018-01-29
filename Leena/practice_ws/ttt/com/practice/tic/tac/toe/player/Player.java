package com.practice.tic.tac.toe.player;

import java.util.Scanner;

import com.practice.tic.tac.toe.board.printer.BoardPrinter;
import com.practice.tic.tac.toe.game.manager.TicTacToeBoard;

public class Player extends TicTacToeBoard {
	TicTacToeBoard board = new TicTacToeBoard();
	BoardPrinter printer = new BoardPrinter();

	Scanner in = new Scanner(System.in);
	protected int rows;
	protected int cols;
	protected String[][] matrix = new String[3][3];
	protected String p = "";
	int wrongInput = 0;
	
	public void initGame() {
	      for (int row = 0; row < 3; ++row) {
	         for (int col = 0; col < 3; ++col) {
	            matrix[row][col] = "-";  // all cells empty
	         }
	      }
	   }

	public void getPlayer1Input() {
		p = "X";
		System.out.println("player X : Enter your move (row n column)");
		try {
			do {
				rows = in.nextInt();
				cols = in.nextInt();
			} while (board.checkValidity(matrix, rows, cols, p) == true);
			// board.checkValidity(matrix, rows, cols, p);
			matrix[rows][cols] = "X";
			printer.printMatrix(matrix);
			board.checkMatch(matrix, p);
		} catch (Exception ex) {
			wrongInput = 1;
			System.out.println("please enter a valid i/p");
			if (wrongInput == 1) {
				getPlayer1Input();
			}
		}
		System.out.println();
	}

	public void getPlayer2Input() {
		p = "O";
		System.out.println("player O : Enter your move (row n column)");
		try {
			do {
				rows = in.nextInt();
				cols = in.nextInt();
			} while (board.checkValidity(matrix, rows, cols, p) == true);
			// board.checkValidity(matrix, rows, cols, p);
			matrix[rows][cols] = "O";
			printer.printMatrix(matrix);
			board.checkMatch(matrix, p);
		} catch (Exception ex) {
			wrongInput = 1;
			System.out.println("please enter a valid i/p");
			if (wrongInput == 1) {
				getPlayer2Input();
			}
		}
		System.out.println();
	}

}
