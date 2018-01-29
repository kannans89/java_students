package com.techlabs.tictactoe;

public class Board {
	private int boardSize;
	private int row_index,col_index;
	private String[][] cells;
	private String winningMark;
	public Board(int boardSize)
	{
		this.boardSize=boardSize;
	}
	public int getBoardSize()
	{
		return boardSize;
	}
	public String[][] getBoardData()
	{
		return cells;
	}
	public void createBoard()
	{
		cells=new String[boardSize][boardSize];
		int cellNo=1;
		for(row_index=0;row_index<boardSize;row_index++)
		{
			for(col_index=0;col_index<boardSize;col_index++)
			{
				cells[row_index][col_index]=""+cellNo;
				cellNo++;
			}
		}
	}
	public boolean checkHorizontally(String mark)
	{
		int rowCounter;
		for(row_index=0;row_index<boardSize;row_index++)
		{
			rowCounter=0;
			for(col_index=0;col_index<boardSize;col_index++)
			{
				if(mark==cells[row_index][col_index])//horizontally checking
				{
					rowCounter++;
				}
			}
			if(rowCounter==boardSize)
			{
				winningMark=mark;
				return true;
			}
		}
		return false;	
	}
	public boolean checkVertically(String mark)
	{
		int colCounter;
		for(row_index=0;row_index<boardSize;row_index++)
		{
			colCounter=0;
			for(col_index=0;col_index<boardSize;col_index++)
			{
				if(mark==cells[col_index][row_index])//vertically checking
				{
					colCounter++;
				}
			}
			if(colCounter==boardSize)
			{
				winningMark=mark;
				return true;
			}
		}
		return false;	
	}
	public boolean checkFirstDiagonal(String mark)
	{
		int diagonal1=0;
		for(row_index=0,col_index=boardSize-1; row_index<boardSize; row_index++,col_index--)
		{
			if(mark==cells[row_index][row_index])//diagonal checking
				diagonal1++;
		}
		if(diagonal1==boardSize)
		{
			winningMark=mark;
			return true;
		}
		return false;
	}
	public boolean checkSecondDiagonal(String mark)
	{
		int diagonal2=0;
		for(row_index=0,col_index=boardSize-1; row_index<boardSize; row_index++,col_index--)
		{
			if(mark==cells[row_index][col_index])//diagonal2 checking
				diagonal2++;			
		}
		if(diagonal2==boardSize)
		{
			winningMark=mark;
			return true;
		}
		return false;
	}
	
	public void setMark(int rowPos,int colPos,String mark)
	{
		cells[rowPos][colPos]=mark;
	}
	public String getWinningMark()
	{
		return winningMark;
	}
	
	public  void showBoard()
	{
		for(int row_index=0;row_index<boardSize;row_index++)
		{
			for(int col_index=0;col_index<boardSize;col_index++)
			{
				System.out.print("| "+cells[row_index][col_index]+" |");
			}
			System.out.println();
		}	
	}
	public boolean isValidMove(String cellNo, String mark) {
		for (int row_index = 0; row_index < cells.length; row_index++) {
			for (int col_index = 0; col_index < cells.length; col_index++) {
				if (cells[row_index][col_index] != "X"
						|| cells[row_index][col_index] != "O") {
					if (cellNo.equals(cells[row_index][col_index])) {
						setMark(row_index, col_index, mark);
						return true;
					}
				}
			}
		}
		return false;
	}
}
