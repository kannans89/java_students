package com.input;

import java.io.IOException;

public abstract class SwabhavInputDecorator implements Reader {

	protected Reader io;

	public SwabhavInputDecorator(Reader io) {
		this.io=io;
	}
	
	@Override
	public void read() throws Exception {
		io.read();
	}
	
	
}
