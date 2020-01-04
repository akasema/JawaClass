package com.Class36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Recap {

	public static void main(String[] args) {
		Map<String,Integer> groceryMap=new HashMap<>();
		groceryMap.put("Apple", 2);
		groceryMap.put("Banana", 5);
		groceryMap.put("Milk", 4);
		groceryMap.put("Onion",5);
		
		Iterator<String> keyIter=groceryMap.keySet().iterator();
		while (keyIter.hasNext()) {
			String itKey=keyIter.next();
			Integer val=groceryMap.get(itKey);
			System.out.println(itKey.toUpperCase()+"--->"+val);
			
	//Get all keys and Map them to value milk 
			
			
	
			
		}
		
	}

}
