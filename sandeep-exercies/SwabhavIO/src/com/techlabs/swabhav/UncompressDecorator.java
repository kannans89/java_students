package com.techlabs.swabhav;

import java.io.IOException;

public class UncompressDecorator extends ReaderDecorator {

	public UncompressDecorator(SwbhavIO io) {
		super(io);
	}

	@Override
	public void read() throws IOException {
		decryp();
		io.read();
	}
     
	public void decryp(){
		System.out.println("document uncompress.....!!!!!");
	}
}
