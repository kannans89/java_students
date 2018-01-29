package com.prctice.day1;

public class PoolPuzzle {

	public static void main(String[] args) {
		int x = 0;
		while (x < 4) {
			System.out.print("A");
			if (x < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			if (x > 1) {
				System.out.print(" Oyster");
				x = x + 2;
			}

			if (x == 1) {
				System.out.print("noys");
			}
			if (x < 1) {
				System.out.print("oise");
			}

			System.out.println(" ");
			x = x + 1;
		}
	}

}
