package com.practice.tic.tac.toe.board.printer;

public class BoardPrinter {

	public void printMatrix(String[][] matrix) {
		for (int rows = 0; rows < 3; rows++) {
			for (int cols = 0; cols < 3; cols++) {
				System.out.print(matrix[rows][cols] + " ");
			}
			System.out.println();
		}

	}

}
