package com.techlabs.swbhavio;

import java.io.IOException;

import com.input.Reader;
import com.input.SwabhavInputDecorator;

public class CacheDecorator extends SwabhavInputDecorator {

	public CacheDecorator(Reader io) {
		super(io);
	}

	@Override
	public void read() throws Exception {
		decryp();
		io.read();
	}
	
     
	public void decryp(){
		System.out.println("Chache clear.....!!!!!");
	}
}