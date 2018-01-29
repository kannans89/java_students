package com.practice.dotcomdemogame;

public class SimpleDotComGame {

	public static void main(String[] args) {

		GameHelper helper = new GameHelper();
		SimpleDotCom dotCom = new SimpleDotCom();

		int numOfGuesses = 0;
		int randomNum = (int) (Math.random() * 5);
		int[] locations = { randomNum, randomNum + 1, randomNum + 2 };

		dotCom.setLocationCells(locations);
		boolean isAlive = true;

		while (isAlive == true) {
			String guess = helper.getUserInput("enter a user Input");
			String result = dotCom.checkYourself(guess);
			numOfGuesses++;

			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("you took " + numOfGuesses + " guessess");
			}
		}

	}

}
