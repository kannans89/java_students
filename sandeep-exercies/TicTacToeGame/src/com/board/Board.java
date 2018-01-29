package com.board;

public class Board {

	private int cols;
	private int rows;
	private char[][] cells;
	private boolean xIsMark;

	public Board(int rows) {
		this.rows = rows;
		this.cols = rows;
		makeBoard();
	}

	public boolean getInput(int x, int y) {
		if (isValidChoice(x, y)) {
			if (!isPlacetaken(x, y)) {
				markCell(x, y);
				return true;
			}
		}
		System.out.println("number is not valid");
		return false;
	}

	private boolean isValidChoice(int x, int y) {
		return (x > 0 && x <= rows) && (y > 0 && y <= cols);
	}

	public char[][] drawBoard() {
		return cells;
	}

	private void makeBoard() {
		cells = new char[rows][cols];
		int k = 49;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++, k++) {
				cells[i][j] = (char) k;
			}
		}
	}

	private void markCell(int x, int y) {
		if (xIsMark) {
			cells[x - 1][y - 1] = 79;
			xIsMark = false;
		} else {
			cells[x - 1][y - 1] = 88;
			xIsMark = true;
		}
	}

	private boolean isPlacetaken(int x, int y) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (cells[i][j] == 79 || cells[i][j] == 88) {
					if ((i + 1) == x && (j + 1) == y) {
						System.out.println(" \n         THIS PLACE IS TAKEN    \n  ");
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean hasWins() {
		return isHorizonatlyInLine() || isVerticalyInLine() || isDigonalyInLine();
	}

	public boolean hasDraws() {
		 for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (cells[i][j] != 79 && cells[i][j] != 88) {
					return false;
				} else {
					if (i == rows - 1 && j == cols - 1) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean isHorizonatlyInLine() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols - 1; j++) {
				if (cells[i][j] != cells[i][j + 1]) {
					break;
				}
				if (j == cols - 2) {
					return true;
				}

			}
		}

		return false;
	}

	private boolean isVerticalyInLine() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols-1; j++) {
				if (cells[j][i] != cells[j+1][i]) {
					break;
				}
				if (j == rows - 2) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isDigonalyInLine() {
		for (int i = 0; i < rows - 1; i++) {
			if (cells[i][i] != cells[i + 1][i + 1]) {
				break;
			}
			if (i == rows - 2) {
				return true;
			}
		}
		for (int i = 0, j = cols - 1; i < rows - 1; i++, j--) {
			if (cells[i][j] != cells[i + 1][j - 1]) {
				break;
			}
			if (i == rows - 2) {
				return true;
			}
		}
		return false;
	}

}
