package com.techlabs.tictactoeCode;

public class PlayingBoard {

	private char[][] board;
	private int columnsOfBoard;
	private int rowsOfBoard;
	private static final int SIZE = 4;

	public PlayingBoard(int rowsOfBoard, int columnsOfBoard) {
		this.rowsOfBoard = rowsOfBoard;
		this.columnsOfBoard = columnsOfBoard;
		this.board = new char[rowsOfBoard][columnsOfBoard];
	}

	public void boardSetUp() {
		rowsOfBoard = board.length;
		if (rowsOfBoard > 0) {
			columnsOfBoard = board[0].length;
		} else {
			System.out.println("Please enter some values..");
		}

		for (int line = 0; line < rowsOfBoard; line++) {
			for (int columns = 0; columns < columnsOfBoard; columns++) {
				board[line][columns] = '*';
			}
		}

	}

	public boolean isFullBoard() {
		for (int line = 0; line < rowsOfBoard; line++) {
			for (int coloumn = 0; coloumn < columnsOfBoard; coloumn++) {
				int boxValue = board[line][coloumn];
				if (boxValue == '*') {
					return false;
				}
			}
		}
		System.out.println("Board is full...Game is Draw");
		return true;

	}

	public boolean updateBoard(int rowToUpdate, int coloumnToUpdate,
			int playerSign) {

		boolean boardUpdate = false;
		if (board[rowToUpdate][coloumnToUpdate] == '*') {
			board[rowToUpdate][coloumnToUpdate] = (char) playerSign;
			boardUpdate = true;
		} else {
			System.out.println("Invalid Move..Please play again..!!!!");
		}
		return boardUpdate;
	}

	public boolean checkHorizontal(Player currentPlayer) {
		boolean win = false;
		for (int row = 0; row < rowsOfBoard; row++) {
			if (checkRow(row, currentPlayer)) {
				win = true;
			}
		}
		return win;
	}

	private boolean checkRow(int row, Player currentPlayer) {
		int column = 0;
		char sign = (char) currentPlayer.getPlayerSign();
		while (column < columnsOfBoard) {
			if (sign == '*' || sign != board[row][column]) {
				return false;
			}
			column++;
		}
		return true;
	}

	public boolean checkVertical(Player currentPlayer) {
		boolean win = false;
		for (int column = 0; column < columnsOfBoard; column++) {
			if (checkColumn(column, currentPlayer)) {
				win = true;
			}
		}
		return win;
	}

	private boolean checkColumn(int column, Player currentPlayer) {
		int row = 0;
		char sign = (char) currentPlayer.getPlayerSign();
		while (row < columnsOfBoard) {
			if (sign == '*' || sign != board[row][column]) {
				return false;
			}
			row++;
		}
		return true;
	}

	public boolean checkDigonal(Player currentPlayer) {
		return checkFristDiagonal()||checkSecondDiagonal();
	}

	

	private boolean checkFristDiagonal() {
		char cell1 = board[0][0];
		int rowColumn = 0;
		while (rowColumn < SIZE) {
			if (cell1 == '*' || cell1 != board[rowColumn][rowColumn]) {
				return false;
			}
			rowColumn++;
		}
		return true;
	}
	
	private boolean checkSecondDiagonal() {
		char cell2 = board[0][2];
		int row = 0;
		int column =2;
		while (row < SIZE) {
			if (cell2 == '*' || cell2 != board[row][column]) {
				return false;
			}
			row++;
			column--;
		}		return true;
	}
	public boolean checkWinner(Player currentPlayer) {
		boolean winner = false;

		boolean checkRow = checkHorizontal(currentPlayer);
		boolean checkColumn = checkVertical(currentPlayer);
		boolean checkDiagonal = checkDigonal(currentPlayer);

		if (checkRow || checkColumn || checkDiagonal) {
			winner = true;
		}
		if (winner) {
			System.out.println("We have a Winner...stop the game");
			System.out.println(currentPlayer.getPlayerName()
					+ " is the current winner");
		}
		return winner;

	}

	@Override
	public String toString() {
		return "\n Your Playing Board :\n" + board[0][0] + " |" + ""
				+ board[0][1] + " |" + "" + board[0][2] + "\n" + ""
				+ board[1][0] + " |" + "" + board[1][1] + " |" + ""
				+ board[1][2] + "\n" + "" + board[2][0] + " |" + ""
				+ board[2][1] + " |" + "" + board[2][2] + "\n";
	}

}

