package com.rays.excercise;

public class Generate {
	

	public static void main(String[] args) {
		
		int max = 100;
		int mix =1;
		
		int random = max - mix+1;
		
		for (int i = 0; i <5; i++) {
			
			int Random =(int)(Math.random()*random)+mix;
			
			System.out.println(Random);
			
			
		}
		

	}  

}
