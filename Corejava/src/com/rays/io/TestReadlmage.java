package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class TestReadlmage {
public static void main(String[] args)throws Exception {
		 
	FileInputStream in = new FileInputStream("C:\\Users\\DELL\\Desktop\\IO\\abhi\\my baby.webp");
	FileOutputStream out=new FileOutputStream("C:\\Users\\DELL\\Desktop\\IO\\abhi\\meri jaan.webp");
	
	
	int ch= in.read();
	while(ch!=-1) {
		
		out.write((char)ch);
		
		
		
		ch=in.read();
		
	}
	out.close();
	in.close();
	
	System.out.println("boss Thar .....!!!!!");
	
}
}
