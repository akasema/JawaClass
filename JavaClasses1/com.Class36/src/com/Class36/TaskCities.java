package com.Class36;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
/*Create a Map from array of cities that will sort keys in alphabetical order.
 *  As a key store the name of the city and as a value store the length of the city 
 *  (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
If any city name is more than 7 characters remove that city ( use Iterator ). 
 */
class Cities{
	String name;
	int cKey;
	Cities (String name, int cKey){
		this.name=name;
		this.cKey=cKey;
	}

	public void display() {
		System.out.println(name+" Name "+ cKey+" Ckey");
	}
}
public class TaskCities {

	public static void main(String[] args) {
		Map<String, Integer> cityMap=new TreeMap<>();
		cityMap.put("Istanbul", 8);
		cityMap.put("Paris", 5);
		cityMap.put("Moscow", 6);
		cityMap.put("WashingtonDC", 13);
		

		Iterator<Entry<String, Integer>> cityIter=cityMap.entrySet().iterator();
		while (cityIter.hasNext()) {
			  Entry<String, Integer> entry=cityIter.next();
	         String key=entry.getKey();
	            Integer value=entry.getValue();
	            if(value>7) {
	                cityIter.remove();
	            }else {
	                System.out.println(key+" "+value);
	            }
		}
		
		
		
		
		 

	}

}
