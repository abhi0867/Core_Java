package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		
	

	List list = new ArrayList();
	list.add("one");
	list.add(200);
	list.add("four");
	list.add(500);
	list.add("abhi");
	
	Iterator it = list.iterator();
	
	while (it.hasNext()){
		
		System.out.println(it.next());
		
	}
		
		System.out.println(list);
		
		
	
	
    	
}
}