package com.techlabs.input;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputReader {


	private BufferedReader inputReader;

	public InputReader() {
		inputReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public String getUserId(String messagePrompt) {
		String userId = null;
		System.out.println(messagePrompt);
		try {
			userId = inputReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userId;
	}
	public String getPassword(String messagePrompt) {
		String password = null;
		System.out.println(messagePrompt);
		try {
			password= inputReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return password;
	}
}
	

