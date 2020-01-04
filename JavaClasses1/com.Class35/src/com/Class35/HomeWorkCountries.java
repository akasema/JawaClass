package com.Class35;
import java.util.*;
public class HomeWorkCountries {

	public static void main(String[] args) {
	
		Map<String, String> countryMap=new TreeMap<>();
		countryMap.put("Brunei", "Brunei");
		countryMap.put("Turkey", "Ankara");
		countryMap.put("USA", "DC");
		countryMap.put("Rwanda", "Kigali");
		countryMap.put("Russia", "Moscow");
		
		System.out.println(countryMap);
		
		Set<String> country=countryMap.keySet();
		for (String ky:country) {
			System.out.println(ky+":"+countryMap.get(ky));
		}
		Iterator<String> it=country.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str+":"+countryMap.get(str));
			
		}

	}

}
