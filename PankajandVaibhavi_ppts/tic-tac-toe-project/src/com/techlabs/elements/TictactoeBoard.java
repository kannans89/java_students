package com.techlabs.elements;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.runner.InvalidInputException;



public class TictactoeBoard {
	
	private static final int SIZE = 3;
    private char[][] board = new char[SIZE][SIZE];
	private Set<String> validCells;
	
	public TictactoeBoard() {
		validCells = new HashSet<String>();
		for (int row = 0; row < SIZE; row++) {
			for (int column = 0; column < SIZE; column++) {
				board[row][column] = ' ';
				validCells.add(row+""+column);
			}
		}
	}
	
	public void print() {
		int column, row;
		for (row = SIZE - 1; row >= 0; row--) {
			System.out.print(row + " ");
			for (column = 0; column < SIZE; column++) {
				System.out.print("|" + board[row][column]);
			}
			System.out.println("|");
		}
		System.out.print("   ");
		for (column = 0; column < SIZE; column++) {
			System.out.print(column + " ");
		}
		System.out.println();

	}
	
	public void placeMark(char playerMark, int row, int column) {
		if (board[row][column] != ' ') {
			System.out.println("oops...cell already occupied...choose another cell");
		} else {
			board[row][column] = playerMark;
			//occupiedCells++;
		}
	}
	
	public boolean isBoardFull() {
		boolean isFull = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
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

		return ((c1 != ' ') && (c1 == c2) && (c2 == c3));

	}
	
	public void checkForValidCell(String inputCell) {
		if(validCells.contains(inputCell)){
			return;
		}else{
			throw new InvalidInputException("Error..!!! Invalid Input");
		}
	}

	

}
