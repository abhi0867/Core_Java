package com.rays.io;

import java.io.File;

public class Attribute {

	public static void main(String[] args) {
	File f = new File("C:\\Users\\DELL\\Desktop\\IO\\abh");
	if(f.exists()) {
		System.out.println("Name"+f.getName());
		System.out.println("Absoiute path;"+f.getAbsolutePath());
		System.out.println("Is writable;"+f.canWrite());
		System.out.println("Is readable;"+f.canRead());
		System.out.println("Is File"+f.isFile());
		System.out.println("Is Directory"+f.isFile());
		
	}

	}

}
