package com.rays.collection;


import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		c1.add(100);
		c1.add("one");
		c1.add("c");
		
		System.out.println("c1="+c1);
		
		Collection c2= new ArrayList();
		c2.add(1);
		c2.add(c1);
		System.out.println("c2 = " + c2);
		
		System.out.println("c2.contains(c1)" + c2.contains(c1));
		c1.remove("one");
		System.out.println("c1.remove()" + c1);
		c1.add(100);
		c1.isEmpty();
		System.out.println("c1.isEmpty" + c1);
		c1.clear();
		System.out.println("c1.clear" + c1);
		
		
	c2.size();
	System.out.println("c2.size()" + c2);
		
	
	
	
	}
}









