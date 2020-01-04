package com.Class35;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWork {

	public static void main(String[] args) {
//		 HashMap<Integer, String> map=new HashMap<>();
//		 map.put(1, "Google");
//		 map.put(2, "Syntax");
//		 map.put(3, "Pioneer");
//		 map.put(4, "Syntax"); 
//		 map.put(1, "ATFA");
//		 map.put(5, "Syntax");
//		 map.put(3, "Google");
// 
//		System.out.println(map);
//		map.replace(4, "Sematech");
//		map.remove(7);
//		System.out.println(map);
//		System.out.println(map.get(4));
//		map.size();
////		map.clear();
//		Iterator<String> it=map.iterator();
//	    while(it.hasNext()){
//	      String str=it.nextValue();
//	      System.out.println(hmap.size());
//	    
//	      
//	    }
		
		  HashMap<String, String> hmap=new HashMap<>();
		    hmap.put("Street", "Patrick ST");
		    hmap.put("Suite", "265");
		    hmap.put("City", "Vienna");
		    hmap.put("Zip", "22180");
		    hmap.put("Country", "United State");
		    Set<Entry<String, String>> entrySet=hmap.entrySet();
		    
		    Iterator<Entry<String,String>> it=entrySet.iterator();
		    while(it.hasNext()){
		      Entry<String, String> ent=it.next();
		      String str=ent.getKey();
		      System.out.println(str.toUpperCase());
		    }
		   
		
//		// to add a hashlist elements to an array
//		 HashSet<String> hSet=new HashSet<>();
//		   hSet.add("first");
//		   hSet.add("second");
//		   hSet.add("third");
//		   hSet.add("fourth");
//		   hSet.add("fifth");
//		   System.out.println(hSet);
//		   Iterator<String> it=hSet.iterator();
//		    String[] arr=new String[5];
//		    int i=0;
//		   while(it.hasNext()){
//		      String str=it.next();
//		      arr[i]=str;		      
//		       System.out.println(arr[i]);
//		       i++;
//		          }

HashSet<String> hset=new HashSet<>();
hset.add("first");
hset.add("second");
hset.add("third");
hset.add("fourth");
hset.add("fifth");
Iterator<String> it1=hset.iterator();
while(it1.hasNext()){
  String str=it1.next();
  System.out.println(str);
  
}
 
		   
	}

}
