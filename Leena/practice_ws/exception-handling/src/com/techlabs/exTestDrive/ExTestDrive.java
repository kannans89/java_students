package com.techlabs.exTestDrive;

public class ExTestDrive {

	public static void main(String[] args) {
		String test = args[0];
		try {
			System.out.print("T");
			doRisky(test);
			System.out.print("O");
		} catch (MyException e) {
			System.out.print("A");
		} finally {
			System.out.print("W");
		}
		System.out.println("S");
	}

	static void doRisky(String t) throws MyException {
		System.out.print("H");

		if ("yes".equals(t)) {
			throw new MyException();
		}

		System.out.print("R");
	}

}
