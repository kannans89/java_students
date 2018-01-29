package com.techlabs.tictactoe;

import com.techlabs.tictactoe.test.Player;

public class TicTacToeManager {
	private Player player1;
	private Player player2;
	private Board board;
	private int noOfMoves = 0;
	private int boardSize;

	public TicTacToeManager(String player1, String player2, int size) {
		this.player1 = new Player(player1);
		this.player2 = new Player(player2);
		board = new Board(size);
	}

	public void playGame()
	{
		boardSize=board.getBoardSize();
		String mark,cellNo;
		board.createBoard();
		board.showBoard();
		for(int i=0;i<(boardSize*boardSize);i++)
		{
			if(i%2==0)
			{
				cellNo=player1.nextMove();
				mark="X";
				if(board.isValidMove(cellNo,mark) )					
				{
					if(board.checkHorizontally(mark) || board.checkVertically(mark) 
					   || board.checkFirstDiagonal(mark)|| board.checkSecondDiagonal(mark))
					{
						checkWinner();
						board.showBoard();
						break;
					}			
				}
				else
				{
					System.out.println("Invalid Position..Please Enter valid cell no again..");
					i--;
					noOfMoves--;
				}
			}
			else
			{
				cellNo=player2.nextMove();
				mark="O";
				if(board.isValidMove(cellNo,mark))					
				{
					if(board.checkHorizontally(mark) || board.checkVertically(mark) 
					   || board.checkFirstDiagonal(mark)|| board.checkSecondDiagonal(mark))
					{
						checkWinner();
						board.showBoard();
						break;
					}			
				}
				else
				{
					System.out.println("Invalid Position..Please Enter valid cell no again..");
					i--;
					noOfMoves--;
				}
			}
			board.showBoard();
			noOfMoves++;
		}

		if(isDraw())
			System.out.println("GAme is draw..!!");
	}

	public void checkWinner() {
		String mark = board.getWinningMark();
		if (mark == "X") {
			System.out.println(player1.getName() + " won the game..!!!");
		} else {
			System.out.println(player2.getName() + " won the game..!!!");
		}
	}

	public boolean isDraw() {
		if (noOfMoves >= boardSize * boardSize-1)
			return true;
		else
			return false;

	}

}
