package com.rays.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestPrintWriter {
public static void main(String[] args)throws Exception {
	FileWriter file = new FileWriter("C:\\Users\\DELL\\Desktop\\IO\\abhi\\abhishek.txt");
	PrintWriter out = new PrintWriter(file);
	out.println("Hello how are you ??");
	out.println("hello kanak ???");
	out.close();
	file.close();
	
	

	
}
}
