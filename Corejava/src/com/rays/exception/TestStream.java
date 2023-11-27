package com.rays.exception;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
public static void main(String[] args) {
	
	List<String>list=new ArrayList();
	
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list.add("five");
	list.add("six");
	list.add("seven");
	list.add("eight");
	list.add("nine");
	list.add("ten");
	Stream<String>s=list.stream();
	
	s.map(e->e.toUpperCase()).distinct().sorted().forEach(e->{System.out.println(e);});
	
	
	
	
}
}
