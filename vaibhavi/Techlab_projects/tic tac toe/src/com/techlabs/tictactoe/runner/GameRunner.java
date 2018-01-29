package com.techlabs.tictactoe.runner;

import com.techlabs.tictacto.inputs.GameInputs;
import com.techlabs.tictactoe.board.Board;
import com.techlabs.tictactoe.board.Mark;

public class GameRunner {
	
	Board board;
	Mark mark;
	GameInputs inputs;
	
	public GameRunner()
	{
		board=new Board();
		mark=new Mark();
		inputs=new GameInputs();
	}

	public void play()
	{
		board.setBoard();
		while(!board.checkForWin())
		{   System.out.println("Enter row and coloumn");
			inputs.takeInputs();
			char currentPlayerMark = mark.getCurrentPlayerMark();
			board.placeMark(currentPlayerMark,inputs.getRow(), inputs.getColoumn());
			mark.changePlayer();
		}
		System.out.println("We have a winner");
		if(board.isBoardFull())
		{
			System.out.println("Game drawn");
		}
	}
}
