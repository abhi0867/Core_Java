package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestList {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10.2);
		a.add("abhi");
		a.add(100);
		a.add('a');
		a.add("parmar");
		a.add("abhi");
	    LinkedList l = new LinkedList();
	    l.add("jay shree ram ");
	    l.add("there is 71 water in the earth");
	    
	    Iterator it = l.iterator();
	    l.add("abhishek");
	    l.add("Ram");
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    	
	    }
	    System.out.println(a);
	    
		
	}

}
