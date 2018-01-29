package com.techlabs.tictactoeCode;
import java.util.Scanner;
import com.techlabs.tictactoe.exception.InvalidInputException;

public class GameRunner {
	Scanner scr = new Scanner(System.in);
	PlayingBoard playingBoard = new PlayingBoard(3, 3);
	InputFromPlayer input = new InputFromPlayer();
	char player1sign = 'X';
	char player2sign = 'O';

	
	public void start() {
	
		System.out.println("Welcome to Tic-Tac_toe");
		playingBoard.boardSetUp();
		System.out.println(playingBoard);
		System.out.println("Lets start the game : ");
		System.out.println("Enter name of First player");
		String player1name = scr.next();
		System.out.println("Enter name of Second player");
		String player2name = scr.next();
		System.out.println(player1name + " you have to play with "
				+ player1sign);
		System.out.println(player2name + " you have to play with "
				+ player2sign);
		Player player1 = new Player(player1name, player1sign);
		Player player2 = new Player(player2name, player2sign);
		System.out.println();

		while (playingBoard.isFullBoard() != true) {

			// player 1
			play(player1);
			boolean status1 = playingBoard.checkWinner(player1);
			if (status1)
				break;
			if (playingBoard.isFullBoard())
				break;

			// player 2

			play(player2);
			boolean status2 = playingBoard.checkWinner(player2);
			if (status2)
				break;

			if (playingBoard.isFullBoard())
				break;

		}
		if (playingBoard.isFullBoard() && !playingBoard.checkWinner(player1)
				&& !playingBoard.checkWinner(player2)) {
			System.out.println("Match is Draw");
		}
	}

	public void play(Player currentPlayer) {
	
		boolean updateStatus = false;
		while (!updateStatus) {
			int[] inputOfPlayer = input.getInput(currentPlayer);
			boolean status = playingBoard.updateBoard(inputOfPlayer[0],
					inputOfPlayer[1], inputOfPlayer[2]);
			if (status) {
				updateStatus = true;
				System.out.println("Board is updated Successfully...");
				System.out.println(playingBoard);

			} else {
				continue;
			}
		}
		
	}
	

}
