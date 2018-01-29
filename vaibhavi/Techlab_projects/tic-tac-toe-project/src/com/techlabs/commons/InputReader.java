package com.techlabs.commons;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputReader {


	private BufferedReader inputReader;

	public InputReader() {
		inputReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public String getUserInput(String messagePrompt) {
		String userInput = null;
		System.out.println(messagePrompt);
		try {
			userInput = inputReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userInput;
	}



}
