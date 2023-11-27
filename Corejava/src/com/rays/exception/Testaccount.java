package com.rays.exception;

public class Testaccount {
	public static void main(String[] args) {
		Account a = new Account();
		a. deposite (10000);
		try {
			a.Withrawl(7000);
			
		}catch(InsufficientBalance e) {
			System.out.println(e);
		}
	}
	

}
