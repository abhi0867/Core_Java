package com.rays.excercise;

public class Primenumber {
	public static void main(String[] args) {
		
		int a=30;
		int b=0;
		
		for (int i = 30; i < a; i++) {
			
			if(a % i == 0) {
				b++;
				
			}	
		}
		if(b == 0) {
			System.out.println("is prime no.");
		}else {
			System.out.println("not prime no.");
		}
	}

}
