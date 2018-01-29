package serializationTest;

import java.io.*;

import serialization.Serialisation;

public class SerialisationTest {
	public static void main(String args[]) throws Exception {
		Serialisation s1 = new Serialisation(111, "Pratibha", 22);
		FileOutputStream fout = new FileOutputStream("Serialisedfile.ser");
		@SuppressWarnings("resource")
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		System.out.println("Success");

	}
}

