package com.techlabs.swabhav;

import java.io.IOException;

public class CacheDecorator extends ReaderDecorator {

	public CacheDecorator(SwbhavIO io) {
		super(io);
	}

	@Override
	public void read() throws IOException {
		decryp();
		io.read();
	}
     
	public void decryp(){
		System.out.println("Chache clear.....!!!!!");
	}
}