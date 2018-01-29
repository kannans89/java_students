package com.techlabs.hierarchyprovider.factory;

import com.techlabs.hierarchyprovider.io.read.InputReader;
import com.techlabs.hierarchyprovider.io.read.DatabaseReader;
import com.techlabs.hierarchyprovider.io.read.FileReader;
import com.techlabs.hierarchyprovider.io.read.ReadingType;

public class ReadFactory {

	public static InputReader getReader(ReadingType readFrom){
		if (readFrom == ReadingType.FILE) {
			return new FileReader("C:\\employee details.txt");
		} else if (readFrom == ReadingType.DATABASE) {
			return new DatabaseReader();
		}
		return null;
	}
}
