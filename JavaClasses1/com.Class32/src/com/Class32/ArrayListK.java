package com.Class32;

import java.util.ArrayList;

public class ArrayListK {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList();// Generic
		arrayList.add("Kadir");
		arrayList.add("Ayse");
		arrayList.add("Busra");
		System.out.println(arrayList.isEmpty());
		
		System.out.println(arrayList.contains("Ayse"));
		System.out.println(arrayList.size());
		System.out.println("----------------NonGeneric------------");
		ArrayList aList=new ArrayList();//nongeneric tipi belirtmezsen her þeyi kabulleder
		aList.add("Kadir");
		aList.add("Ayse");
		aList.add("Busra");
		aList.add(216);
		System.out.println(arrayList.isEmpty());
		System.out.println(aList.get(3));
		System.out.println(aList.contains(216));
		System.out.println(aList.size());
	}
	

}
