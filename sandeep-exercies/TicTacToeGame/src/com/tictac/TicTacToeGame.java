package com.tictac;

import java.util.Scanner;

import com.board.Board;

public class TicTacToeGame {

	private static Board board;
	private static Player player1;
	private static Player player2;
	public static boolean isPlayer1Turn = true;

	public static void main(String[] args) {
		board = new Board(3);
		player1 = new Player("sandeep");
		player2 = new Player("vishal");

		System.out.println("----------------Welcome----------------");
		System.out.println("                   In");
		System.out.println("            TicTacToeGame");
		System.out.println("On your turn plz enter a number between 1 to 9\n");
		playGame();
	}

	public static void playGame() {
		while (true) {
			takeOneTurn();
			print(board.drawBoard());
			if (board.hasWins()) {
				System.out.println("--------  congratulation you win --------");
				break;
			}
			if (board.hasDraws()) {
				System.out.println("--------  Draws --------");
				break;
			}
		}
	}

	public static void takeOneTurn() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean input;
		if (isPlayer1Turn) {
			System.out.println(player1.getName() + " ,Enter your choice : ");
			input = board.getInput(sc.nextInt(), sc.nextInt());
			if (input) {
				isPlayer1Turn = false;
			} else {
				takeOneTurn();
			}

		} else {
			System.out.println(player2.getName() + " ,Enter your choice : ");
			input = board.getInput(sc.nextInt(), sc.nextInt());
			if (input) {
				isPlayer1Turn = true;
			} else {
				takeOneTurn();
			}
		}
	}

	public static void print(char[][] cells) {
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells.length; j++) {
				System.out.print(cells[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
