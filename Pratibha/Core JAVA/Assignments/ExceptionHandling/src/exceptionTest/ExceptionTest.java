package exceptionTest;

import exception.PratibhaException;

public class ExceptionTest {

static void validate(int age) throws PratibhaException {
		if (age < 18)
			throw new PratibhaException("Not a valid age, you cann't vote ");
		else
			System.out.println("Welcome to vote");
	}

	public static void main(String[] args) {
		try {
			validate(17);
			System.out.println("Hellow voter now you can vote");

		} catch (PratibhaException m) {
			System.out.println("Exception occured: " + m);
		} finally {
			System.out.println("Thank you for visit");
		}
	}

}
