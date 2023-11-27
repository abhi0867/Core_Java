package com.rays.exception;

public class InsufficientBalance extends Exception  {
	public InsufficientBalance () {
		super("bank accountbalance is insufficient");
	}

}
