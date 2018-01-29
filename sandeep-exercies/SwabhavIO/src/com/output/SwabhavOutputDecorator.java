package com.output;

import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public abstract class SwabhavOutputDecorator implements Writer {

	protected Writer io;

	public SwabhavOutputDecorator(Writer writer) {
		this.io=writer;
	}
	
	
	@Override
	public void write(String s) throws Exception {
		io.write(s);
	}

}
