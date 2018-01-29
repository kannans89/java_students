package com.techlabs.custom.exception;

import com.techlabs.shape.Rectangle;

public class InvalidDimensionException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private String errMsg;

	public InvalidDimensionException(String errMsg, Rectangle r) {
		this.height = r.getHeight();
		this.width = r.getWidth();
		this.errMsg = errMsg;
	}

	@Override
	public String getMessage() {
		return errMsg + " width: " + width + " height: " + height;
	}

}
