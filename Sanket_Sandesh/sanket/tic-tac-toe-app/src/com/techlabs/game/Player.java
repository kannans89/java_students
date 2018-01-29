package com.techlabs.game;

import java.util.Scanner;

import com.techlabs.game.enums.MarkType;

public class Player {
	private String name;
	private MarkType mark;
	private int row, col;
	Scanner sc = new Scanner(System.in);

	public Player(String name, MarkType mark) {
		this.mark = mark;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public MarkType getMark() {
		return mark;
	}

	public void nextMove() {

		System.out.println(this.getName() + " enter position for "
				+ this.getMark());
		row = sc.nextInt();
		col = sc.nextInt();

	}

	public int getRow() {
		return row - 1;
	}

	public int getCol() {
		return col - 1;
	}
}
