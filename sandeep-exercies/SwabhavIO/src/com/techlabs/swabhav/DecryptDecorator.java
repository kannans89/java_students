package com.techlabs.swabhav;

import java.io.IOException;

public class DecryptDecorator extends ReaderDecorator {

	public DecryptDecorator(SwbhavIO io) {
		super(io);
	}

	@Override
	public void read() throws IOException {
		decryp();
		io.read();
	}
     
	public void decryp(){
		System.out.println("Decrption is done.....!!!!!");
	}
}
