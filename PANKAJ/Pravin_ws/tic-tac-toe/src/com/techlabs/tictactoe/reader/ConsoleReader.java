package com.techlabs.tictactoe.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public String getInput() {
		String userInput = null;
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			userInput = input.readLine();
		} catch (IOException e) {
			System.out.println(e);
		}
		return userInput;
	}

}
