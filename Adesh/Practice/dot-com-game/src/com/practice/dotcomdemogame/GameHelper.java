package com.practice.dotcomdemogame;

import java.io.*;

public class GameHelper {
	public String getUserInput(String text) {
		String inputLine = null;
		System.out.println(text);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			inputLine = br.readLine();
			if (inputLine.length() == 0) {
				return null;
			}

		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine;

	}

}
