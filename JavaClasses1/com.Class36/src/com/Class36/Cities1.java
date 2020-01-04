package com.Class36;
import java.util.Iterator;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.TreeMap;
	
public class Cities1 {
	
	
	//CITIES
	
	
	/*
	 * Create a Map from array of cities that will sort keys in alphabetical order. 
	 * As a key store the name of the city and as a value store the length of the city 
	 * (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
	 * If any city name is more than 7 characters remove that city ( use Iterator ). 
	 */
	
	    public static void main(String[] args) {
	        Map<String, Integer> cityMap=new TreeMap<>();
	        String str="Istanbul";
	        Integer a=str.length();
	        cityMap.put(str, a);
	        str="Izmir";
	        a=str.length();
	        cityMap.put(str, a);
	        str="Aydin";
	        a=str.length();
	        cityMap.put(str, a);
	        str="Manisa";
	        a=str.length();
	        cityMap.put(str, a);
	        str="Eskisehir";
	        a=str.length();
	        cityMap.put(str, a);
	        
	        Iterator<Entry<String, Integer>> cityIterator=cityMap.entrySet().iterator();
	        while(cityIterator.hasNext()) {
	            Entry<String, Integer> entry=cityIterator.next();
	            String key=entry.getKey();
	            Integer value=entry.getValue();
	            if(value>7) {
	                cityIterator.remove();
	            }else {
	                System.out.println(key+" "+value);
	            }
	            
	        }
	    }
	}

