package serializationTest;

import java.io.*;

import serialization.Serialisation;

public class Deserialisation {
	public static void main(String args[]) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"Serialisedfile.ser"));
		Serialisation s2 = (Serialisation) in.readObject();
		System.out.println(s2.getId() + "   " + s2.getName() + "    "
				+ s2.getAge());
		in.close();

	}
}
