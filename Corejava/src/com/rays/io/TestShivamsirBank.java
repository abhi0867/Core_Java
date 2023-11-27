htet4package com.rays.io;

public class TestShivamsirBank {
public static void main(String[] args) {
	 int num = 3500;
	 int[] note= {500,200,100,20,10,5};
	 int count =0;
	 for (int i = 0; i < note.length; i++) {
		 count = num / note[i];
		 
		 
		 if (count >0) {
			 System.out.println(note[i]+""+ count);
			 
		
	}
	num= num % note[i];
	
	}
		
	}

	
}

