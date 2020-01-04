package com.Class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class RetriveAll {

	public static void main(String[] args) {
		// to create a Map of classroom
		
		Map<String, Integer> classRoom=new HashMap<>();
	
		classRoom.put("Instructors", 3);
		classRoom.put("Student", 80);
		classRoom.put("Tables", 20);
		classRoom.put("Chairs", 80);
		
		System.out.println(classRoom);
		classRoom.entrySet();
		System.out.println(classRoom.entrySet());
		
		Set<Entry<String, Integer>> entrySet=classRoom.entrySet();
		for (Entry<String, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("Iterator method");
		Iterator<Entry<String, Integer>> entIter=entrySet.iterator();
		while(entIter.hasNext()) {
			Entry<String, Integer> str=entIter.next();
			System.out.println(str.getKey()+":"+str.getValue());
			 
		}
		
	}

}
