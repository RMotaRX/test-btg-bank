package com.btg.test.exception;

public class InvalidActionException extends RuntimeException {

	private static final long serialVersionUID = -208695084444615742L;
	
	public InvalidActionException(String msg) {
		super(msg);
	}
}
