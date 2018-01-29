package com.techlabs.game;

import com.techlabs.game.enums.MarkType;
import com.techlabs.game.exception.InvalidPosition;

public class TicTacToe {
	private Player player1;
	private Player player2;
	private Board board;

	public TicTacToe(String playerName1, String playerName2, int bsize) {
		this.player1 = new Player(playerName1, MarkType.X);
		this.player2 = new Player(playerName2, MarkType.O);
		board = new Board(bsize);
	}

	public void startGame() {
		board.initialize();
		board.display();
		boolean switchPlayer = false, totalCount = false;
		int moveCount = 0;
		while (moveCount < board.getBoardSize() * board.getBoardSize()) {
			if (!switchPlayer) {
				try {
					player1.nextMove();
					board.updateBoard(player1.getRow(), player1.getCol(),
							player1.getMark());
					switchPlayer = true;
					board.display();
					if (board.isWinner(player1.getRow(), player1.getCol(),
							player1.getMark())) {
						break;
					}
				} catch (InvalidPosition ip) {
					System.out.println(ip.getMessage());
				} catch (ArrayIndexOutOfBoundsException exe) {
					System.out.println("Enter Valid Position");
				}
			} else {
				try {
					player2.nextMove();
					board.updateBoard(player2.getRow(), player2.getCol(),
							player2.getMark());
					switchPlayer = false;
					board.display();
					if (board.isWinner(player2.getRow(), player2.getCol(),
							player2.getMark())) {
						break;
					}
				} catch (InvalidPosition ip) {
					System.out.println(ip.getMessage());
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("Enter Valid Question");
				}
			}
			moveCount++;
		}
		if (moveCount == board.getBoardSize() * board.getBoardSize()) {
			totalCount = true;
		}
		if (switchPlayer == false && totalCount == false) {
			System.out.println(player2.getName() + " is the winner.");
		} else if (switchPlayer == true && totalCount == false) {
			System.out.println(player1.getName() + " is the winner.");
		} else {
			System.out.println("Draw");
		}
	}

}
