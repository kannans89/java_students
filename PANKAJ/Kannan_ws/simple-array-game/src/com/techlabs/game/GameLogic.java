package com.techlabs.game;

public class GameLogic {
	int[] loc;
	int count;
	
	public void setLoc(int[] loc)
	{
		this.loc=loc;
	}
	
	public int getCount()
	{
	return count;	
	}
	
	public void checkGuess(int g)
	{
		boolean flag=false;
		
		for(int i: loc)
		{
			if(g==i)
			{
				System.out.print("Hit");
				count++;
				flag=true;
				if(count == 3)
					System.out.println(" & Kill");
				break;
			}
		}
		
		if(!flag)
			System.out.println("Miss");
			
	}

}
