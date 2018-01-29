package com.techlabs.game.test;
import java.io.*;

import com.techlabs.game.GameLogic;

public class GameTest {

	public static void main(String[] args) throws IOException {
		
		int g,rand;
		GameLogic gl = new GameLogic();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		rand= (int)(Math.random()*8);
		int location[] ={rand, rand+1, rand+2};
		gl.setLoc(location);
		
		while(gl.getCount()!=3)
		{	
		System.out.println("\nEnter a number: ");
		g=Integer.parseInt(br.readLine());
		gl.checkGuess(g);
		}
	}
}
