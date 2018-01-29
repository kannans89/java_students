package com.techlabs.game;

import com.techlabs.game.enums.MarkType;
import com.techlabs.game.exception.InvalidPosition;

public class Board {
	private MarkType board[][];
	private int boardSize;

	public Board(int bsize) {
		this.boardSize = bsize;
		board = new MarkType[bsize][bsize];
	}

	public int getBoardSize() {
		return boardSize;
	}

	public void updateBoard(int row, int col, MarkType mark) {
		if (row > boardSize || col > boardSize) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (board[row][col] == MarkType.$) {
			board[row][col] = mark;
		} else {
			throw new InvalidPosition("Enter valid position");
		}
	}

	public void initialize() {
		for (int row = 0; row < boardSize; row++)
			for (int col = 0; col < boardSize; col++)
				board[row][col] = MarkType.$;
	}

	public boolean isWinner(int passedRow, int passedCol, MarkType mark) {
		for (int col = 0; col < boardSize; col++) {
			if (board[passedRow][col] != mark)
				break;
			if (col == boardSize - 1) {
				return true;
			}
		}

		for (int row = 0; row < boardSize; row++) {
			if (board[row][passedCol] != mark)
				break;
			if (row == boardSize - 1) {
				return true;
			}
		}

		if (passedRow == passedCol) {
			for (int row = 0; row < boardSize; row++) {
				if (board[row][row] != mark)
					break;
				if (row == boardSize - 1) {
					return true;
				}
			}
		}

		if (passedRow + passedCol == boardSize - 1) {
			for (int index = 0; index < boardSize; index++) {
				if (board[index][(boardSize - 1) - index] != mark)
					break;
				if (index == boardSize - 1) {
					return true;
				}
			}
		}
		return false;
	}

	public void display() {
		for (int row = 0; row < boardSize; row++) {
			for (int col = 0; col < boardSize; col++) {
				System.out.print(" " + board[row][col] + " ");
				if (col != boardSize - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (row != boardSize - 1) {
				for (int col = 0; col < boardSize; col++)
					System.out.print("--- ");
			}
			System.out.println();
		}
	}

}
