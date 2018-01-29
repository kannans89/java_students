package com.techlabs.tictactoegame;

	public abstract class Players {
	    
	    protected int[] attempt = new int[2];
	    protected int playerNo;
	    protected String playerName;

	    
	    public Players(int player){
	        this.playerNo = player;
	    }
	    
	    public abstract void play(PlayingBoard board);
	    
	    public abstract void Try(PlayingBoard board);

	    public boolean checkTry(int[] attempt, PlayingBoard board){
	        if(board.getPosition(attempt) == 0)
	            return true;
	        else
	            return false;
	            
	    }
	    
	}
