package com.practice.tic.tac.toe.player;

import java.util.Scanner;

import com.practice.tic.tac.toe.board.printer.BoardPrinter;
import com.practice.tic.tac.toe.game.manager.GameHelper;
import com.practice.tic.tac.toe.game.manager.TicTacToeBoard;

public class Player extends TicTacToeBoard {
	TicTacToeBoard board = new TicTacToeBoard();
	BoardPrinter printer = new BoardPrinter();
	GameHelper helper = new GameHelper();

	Scanner in = new Scanner(System.in);
	protected int rows;
	protected int cols;
	protected String[][] matrix = new String[3][3];
	protected String player = "";
	int wrongInput = 0;
	int draw = 0;
	
	public void initGame() {
	      for (int row = 0; row < 3; ++row) {
	         for (int col = 0; col < 3; ++col) {
	            matrix[row][col] = "-";
	         }
	      }
	   }

	public void getPlayer1Input() {
		player = "X";
		System.out.println("player X : Enter your move (row n column)");
		try {
			do {
				rows = in.nextInt();
				cols = in.nextInt();
			} while (board.checkValidity(matrix, rows, cols, player) == true);
			matrix[rows][cols] = "X";
			printer.printMatrix(matrix);
			board.checkMatch(matrix, player);
			isDraw(matrix);
			drawCheck();
		} catch (Exception ex) {
			wrongInput = 1;
			System.out.println("please enter a valid i/p");
			if (wrongInput == 1) {
				getPlayer1Input();
			}
		}
		System.out.println();
	}

	private void drawCheck() {
		if(draw == 0){
			System.out.println("game is draw.");
			helper.restartGame();
		}
	}

	public void getPlayer2Input() {
		player = "O";
		System.out.println("player O : Enter your move (row n column)");
		try {
			do {
				rows = in.nextInt();
				cols = in.nextInt();
			} while (board.checkValidity(matrix, rows, cols, player) == true);
			matrix[rows][cols] = "O";
			printer.printMatrix(matrix);
			board.checkMatch(matrix, player);
			isDraw(matrix);
			drawCheck();
		} catch (Exception ex) {
			wrongInput = 1;
			System.out.println("please enter a valid i/p");
			if (wrongInput == 1) {
				getPlayer2Input();
			}
		}
		System.out.println();
	}
	
	public void isDraw(String[][] matrix) {
		draw = 0;
		for (int row = 0; row < 3; ++row) {
	         for (int col = 0; col < 3; ++col) {
	            if(matrix[row][col] == "-"){
	            	draw = 1;
	            	break;
	            }
	         }if(draw == 1){
	         break;}
	      }
		}

}
