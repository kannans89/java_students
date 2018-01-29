package com.techlabs.swabhav;

import java.io.IOException;

public abstract class ReaderDecorator implements SwbhavIO {

	protected SwbhavIO io;

	public ReaderDecorator(SwbhavIO io) {
		this.io=io;
	}
	
	@Override
	public void read() throws IOException {
		io.read();
	}

}
