package com.techlabs.immutable;

public class TestNotQuiteImmutable {

	public static void main(String[] args) {
		int[] myNos = { 10, 20, 30 };

		 NotQuiteImmutable immutable = new NotQuiteImmutable(myNos);
		//Immutable immutable = new Immutable(myNos);

		System.out.println(immutable);

		myNos[2] = 100;

		System.out.println(immutable);

	}

}
