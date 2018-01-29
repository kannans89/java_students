package com.techlabs.tictactoe;

import com.techlabs.tictactoe.matrix.Matrix;
import com.techlabs.tictactoe.reader.ConsoleReader;

public class GameRunner {

	int row, column, value, userID = 1;
	ConsoleReader read = new ConsoleReader();
	Matrix matrix = new Matrix();

	public static void main(String args[]) {
		GameRunner game = new GameRunner();
		game.start();
	}

	public void start() {
		while (!matrix.isFull()) {
			System.out.println("User" + userID + "'s turn");

			System.out.print("Row Number:");
			row = Integer.parseInt(read.getInput());

			System.out.print("Column Number :");
			column = Integer.parseInt(read.getInput());

			value = userID;

			matrix.setValue(value, row, column);

			if (matrix.hasThreeInSequence(row, column)) {
				System.out.println("User " + userID + " won");
				break;
			}
			changeTurn();
		}

		if (matrix.isFull())
			System.out.println("Game drawn");
	}

	public void changeTurn() {
		if (userID == 1)
			userID = 2;
		else
			userID = 1;
	}
}
