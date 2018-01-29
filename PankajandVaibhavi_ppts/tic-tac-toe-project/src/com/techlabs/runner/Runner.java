package com.techlabs.runner;

import java.io.IOException;




import com.techlabs.commons.InputReader;
import com.techlabs.elements.IPlayer;
import com.techlabs.elements.Player;
import com.techlabs.elements.TictactoeBoard;


public class Runner {
	TictactoeBoard board;
	IPlayer player1;
	IPlayer player2;
	InputReader inputReader;
	
	public Runner() {
		inputReader = new InputReader();
		player1 = new Player(inputReader.getUserInput("Enter Player Name 1"), 'O');
		player2 = new Player(inputReader.getUserInput("Enter Player Name 2"), 'X');
		board = new TictactoeBoard();
	}
	
	public void play() {
		String playerInput = null;
		int turnCount = 1;
		String winnerOrDraw = "Game Drawn..!!";
		boolean keepPlaying = true;
		IPlayer currentPlayer;
		while (keepPlaying) {
			currentPlayer = turnCount % 2 == 1 ? player1 : player2;
			while (playerInput == null) {
				board.print();
				playerInput = readAndValidateUserInput(currentPlayer.getName(),
						currentPlayer.getMark());
			}
			if (board.checkForWin()) {
				winnerOrDraw = currentPlayer.getName() + " wins..!!";
				keepPlaying = false;
			} else if (board.isBoardFull()) {
				keepPlaying = false;
			}
			playerInput = null;
			turnCount++;
		}
		printResult(winnerOrDraw);

	}

	private String readAndValidateUserInput(String userName, char userMark) {
		String playerInput = null;
		try {
			playerInput = inputReader.getUserInput(userName
					+ " turn. Enter <row><col>. Eg. 20 for top left cell.");
			board.checkForValidCell(playerInput);
			markBoardCell(userMark, playerInput);
		} catch (CellOccupiedException wrongCell) {
			System.out.println(wrongCell.getErrorMessage());
			playerInput = null;
		} catch (InvalidInputException invalidInput) {
			System.out.println(invalidInput.getErrorMessage());
			playerInput = null;
		}
		return playerInput;

	}

	private void markBoardCell(char mark, String playerInput) {
		board.placeMark(mark, Integer.parseInt(playerInput.substring(0, 1)),
				Integer.parseInt(playerInput.substring(1)));

	}

	private void printResult(String winnerOrDraw) {
		board.print();
		System.out.println("Result: " + winnerOrDraw);
		System.out.println("Press Enter key to exit...");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
