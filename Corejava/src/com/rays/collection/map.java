package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class map {
public static void main(String[] args) {
	 Map map= new HashMap();
	 
	 map.put(1,"one");
	 map.put(2,"ten");
	 map.put(3,"one");
	 map.put(4,"ten");
	 
	 
	System.out.println(map);
	
	System.out.println(map.get(1));
	
	System.out.println(map.values());
	
	System.out.println(map.size());
	
	for (Object object : map . keySet()){
		
		System.out.println(object);
	}

}}