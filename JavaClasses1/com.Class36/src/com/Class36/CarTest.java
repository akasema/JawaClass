package com.Class36;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class CarTest {

	public static void main(String[] args) {
		
		
		Map<Integer, Car> mapCar=new LinkedHashMap<>();
		
		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Toyota", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(6, new Car("Lincoln", "Mkc"));
		
		// display only value objects
		System.out.println(mapCar.size());
		Collection <Car> coll=mapCar.values();
		for (Car c:coll) {
			System.out.println(c.make+c.model);
		}
		
		// map key to its corresponding values(entry set , entry key)
		
		Set<Entry<Integer, Car>>set=mapCar.entrySet();
		for (Entry<Integer,Car> ent:set) {
			Integer i=ent.getKey();
			Car c=ent.getValue();
			System.out.println("Key "+i+ "is associated with "+c.make);
		}
		
		// using keyset to map keys to values
		Set<Integer> keySet=mapCar.keySet();
		for (int key:keySet) {
			// Integer+map Object--> value object (car Type)
		//	System.out.println(key+mapCar.get(key).make+mapCar.get(key).model);
		Car car=mapCar.get(key);
		String carDetails=car.make+"--"+car.model;
		System.out.println(key+"="+carDetails);
				}
		//use iterator to get same
	}
		}


