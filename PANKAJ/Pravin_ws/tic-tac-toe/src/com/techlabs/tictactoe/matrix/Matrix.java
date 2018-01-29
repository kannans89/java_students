package com.techlabs.tictactoe.matrix;

public class Matrix {
	int rows = 3;
	int columns = 3;

	int[][] matrix = new int[rows][columns];

	public void setValue(int value, int row, int column) {
		if (row >= 0 && row < 3 && column>= 0 && column< 3) {
		if (!isMarked(row, column))
			matrix[row][column] = value;
		}
	}

	boolean isMarked(int row, int column) {
		if (matrix[row][column] == 0)
			return false;
		else
			return true;
	}

	public boolean isFull() {
		for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
			for (int colIndex = 0; colIndex < columns; colIndex++) {
				if (matrix[rowIndex][colIndex] == 0)
					return false;
			}
		}
		return true;
	}

	public boolean hasThreeInSequence(int row, int column) {
		if (compareRow(row) || comparecolumn(column)
				|| compareDiagonal(row, column)) {
			return true;
		}
		return false;
	}

	boolean compareRow(int row) {
		if (matrix[row][0] == matrix[row][1]
				&& matrix[row][1] == matrix[row][2])
			return true;
		else
			return false;
	}

	boolean comparecolumn(int column) {
		if (matrix[0][column] == matrix[1][column]
				&& matrix[1][column] == matrix[2][column])
			return true;
		else
			return false;
	}

	boolean compareDiagonal(int row, int column) {
		boolean flag = false;
		if (row == column) {
			if (row == 1) {
				if ((matrix[0][2] == matrix[1][1])
						&& (matrix[1][1] == matrix[2][0]))
					flag = true;
			}
			if ((matrix[0][0] == matrix[1][1])
					&& (matrix[1][1] == matrix[2][2]))
				flag = true;
		} else if ((matrix[0][2] == matrix[1][1])
				&& (matrix[1][1] == matrix[2][0]))
			flag = true;
		return flag;
	}

}