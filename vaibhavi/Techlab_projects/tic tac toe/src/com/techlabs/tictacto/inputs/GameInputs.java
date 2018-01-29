package com.techlabs.tictacto.inputs;

import java.util.Scanner;

public class GameInputs {
	
	Scanner sc;
	int row;
	int coloumn;
	
	public void takeInputs()
	{
		sc=new Scanner(System.in);
		row=sc.nextInt();
		coloumn=sc.nextInt();
		
	}

	public int getRow() {
		return row;
	}

	public int getColoumn() {
		return coloumn;
	}

}
