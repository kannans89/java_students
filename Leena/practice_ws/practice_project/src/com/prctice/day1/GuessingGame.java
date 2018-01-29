package com.prctice.day1;

public class GuessingGame {

	public static void main(String[] args) {

		System.out.println("Welcome to Guessing Game");
		System.out.println("You have to guess a number between 1 to 9");
		/* Calculation of Target Number */
		int targetNumber = (int) (Math.random() * 10);

		int[] players = new int[5];
		int winners[] = new int[5];
		int reference = 1;
		int flag = 0;
		do {
			/* Calculation of Guessing Number for players */
			
			System.out.println("Guess Your number..Your time starts now.");
			for (int index = 1; index < players.length; index++) {
				players[index] = (int) (Math.random() * 10);
				System.out.println("Player" + index + " guessed : "
						+ players[index]);
			}
			for (int guess = 1; guess < players.length; guess++) {
				if (players[guess] == targetNumber) {
					winners[reference] = guess;
					reference++;
				}

			}
			/* displaying winners */
			System.out.println("your Target Number Was:" + targetNumber);
			for (int position = 1; position <= reference; position++) {
				if (winners[position] != 0) {
					System.out.println("player " + winners[position]+ " is winner");
					++flag;
				}

			}

			if (flag == 0) {
				System.out.print("No one is winner....");
				System.out.println("You Have to play again!!!");

			}

		} while (flag == 0);

		System.out.println("Game Over");
		}
	}
