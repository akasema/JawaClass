package com.Class36;
import java.util.Iterator;
	import java.util.LinkedHashMap;
	import java.util.Map;
	
public class Homework {
	
		public static void main(String[] args) {
			Map<Integer, String>storeMap=new LinkedHashMap<>();
			storeMap.put(7664847, "Printer");
			storeMap.put(7879885, "TV");
			storeMap.put(7765555, "Display");
			storeMap.put(7990876, "Fax");
			storeMap.put(7555580, "Laptop");
			System.out.println(storeMap);
			System.out.println("------Retrieve all keys and values using EntrySet with for each loop------");
			for(Map.Entry<Integer, String>entry: storeMap.entrySet()) {
				System.out.println(entry.getKey()+" = " +entry.getValue());
			}
			System.out.println("------Retrieve all keys and values using EntrySet with iterator------");
			Iterator<Map.Entry<Integer, String>>storeIterator=storeMap.entrySet().iterator();
			while(storeIterator.hasNext()) {
				Map.Entry<Integer, String>entry=storeIterator.next();
				System.out.println(entry.getKey()+"="+entry.getValue());
			}	
		}
	}