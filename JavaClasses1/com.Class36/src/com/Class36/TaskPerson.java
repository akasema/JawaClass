package com.Class36;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
class Person{
	private String name, lastName;
	private int age, salary;
	public Person(String name, String lastName, int age, int salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	public String details() {
		return "Name: "+name+" Last Name: "+lastName+" Age: "+age+" Salary: "+salary;
		}	
}

public class TaskPerson {
/*Create a Person class with following private fields: name, lastName, age, salary. 
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. 
In that map store personId and a Person Object. Print each object details.
 * 
 */
	public static void main(String[] args) {
	Map<Integer, Person> mapPers=new LinkedHashMap<>();
	mapPers.put(1, new Person("John","Doe",39,5000));
	mapPers.put(2, new Person("Ali","yildiz",45,6000));
	mapPers.put(3, new Person("Hasan","Kaca",23,5500));
	mapPers.put(4, new Person("Hüseyin","Sirma",34,5400));
	
//	 Set<Entry<Integer, Person>> set=mapPers.entrySet();
//	 for (Entry<Integer,Person> ent:set) {
//		 Integer i=ent.getKey();
//		 Person p=ent.getValue();
//		 System.out.println();
//	 }
	Set<Integer> keySet=mapPers.keySet();
	for (int key:keySet) {
	Person per=mapPers.get(key);
	String perDetails=per.details();
	System.out.println(perDetails);
	
	}

	}

}
