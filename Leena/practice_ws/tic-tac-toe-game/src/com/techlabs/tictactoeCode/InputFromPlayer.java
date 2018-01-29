package com.techlabs.tictactoeCode;

import java.util.Scanner;

public class InputFromPlayer {
	
	public int[] getInput(Player currentPlayer) {

		int[] playerInput = new int[3];
		System.out.println(currentPlayer.getPlayerName() + " It's ur turn.. ");
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Line :");
		int line = scr.nextInt();
		System.out.print("Enter Coloumn : ");
		int coloumn = scr.nextInt();

		playerInput[0] = line;
		playerInput[1] = coloumn;
		playerInput[2] = currentPlayer.getPlayerSign();

		return playerInput;

	}

}
