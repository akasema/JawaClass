package com.Class13;

public class AllStaringMethods {

	public static void main(String[] args) {
		// string is immutable(not changeable) class
		String city="Fairfax";
		String str2=" world";
		System.out.println(city.isEmpty());
		
		String city1="Fairfax";//1 string and 2 reference to save memory
		System.out.println(city.length());// string length olunca bu bir method oluyor ve braket gerekiyor
		
		int [] a= {12,32,55,77};
		System.out.println(a.length);//burda parante yok length of int oldugunda  bu method degil variabe 
	
		System.out.println(city.toUpperCase());// only in runtime no value stored in 
	System.out.println(city.equals(str2));
	}

}
