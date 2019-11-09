package com.Class14;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Wellcome to Syntax Technologies";
		System.out.println(str1.replace(" ", ""));
		
		String str2="123456789 Wellcome to Syntax Technologies +%/&)";
		
		System.out.println(str2.replaceAll("[0-9]", ""));
		System.out.println(str2.replaceAll("[^a-zA-Z^]", ""));
		String[] array=(str2.toLowerCase().split(" "));
		System.out.println("=======================");
		
		for (int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("*****************");
	
	
	String a="Is it Saturday? is it raining? Do we have java class today?";
	String [] arra=(a.split("?"));
	for (int i=0; i<arra.length; i++) {
		System.out.println(arra[i]);
	}
	
	}

}
