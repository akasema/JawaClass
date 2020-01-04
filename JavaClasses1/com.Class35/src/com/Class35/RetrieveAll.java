package com.Class35;

import java.util.*;

public class RetrieveAll {

	public static void main(String[] args) {
	 
		Map<String,String>personMap=new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Adress", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		System.out.println(personMap);
		
		System.out.println("bir objeyi almak");//bir objeyi almak
		System.out.println(personMap.get("State"));
		
		System.out.println("t�m keyleri almak");//t�m keyleri almak
Set<String> keys=personMap.keySet();
		for(String key:keys) {
			System.out.println(key);
					}
		System.out.println("Di�er metod");//t�m keyleri almak
		
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()){
			System.out.println(keysIterator.next());			
		}
		System.out.println("B�t�n Value leri almak");//B�t�n value leri almak
		
		Collection<String> values=personMap.values();
		for (String val:values) {
			System.out.println(val);
		}
		System.out.println("B�t�n hem keys hem valueleri almak almak");//B�t�n hem keys hem valueleri almak almak
	for (String key:keys) {
		System.out.println(key+":"+personMap.get(key));
			}
	
	//using iterator
	Iterator<String> keysIterat=keys.iterator();
	
	while(keysIterat.hasNext()){
		String str=keysIterat.next();
		System.out.println(str+":"+personMap.get(str));
	}
	
	
	} 

}
