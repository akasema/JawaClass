package com.Class15;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is a class (String-sequence of characters
		// Twoo ways of defining 
		// First literal 
		String str="Hello";
		//Second with using new keyword-creating a string object
		String str1 = new String("Hello");
		System.out.println(str);
		//str.(So many method generatedd)
//1) .length 
		System.out.println(str.length());
//2) Case conversion 
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
//3) werify if there is Empty
		System.out.println(str.isEmpty());//boolean
		String str2="";//This is empty 
		String str3=null;// this is NULL (no value)
// 4) How to verify existence of a character in the string ?
		String a="Good evening students";
		System.out.println(a);
		boolean b=a.contains("evening");
//5) StartsWith endsWith // boolean
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("bbb"));
// 6) Get character at specific position
		System.out.println(a.charAt(5));
		System.out.println(a.charAt(a.length()-1));
// 7) get a substring from a string
		System.out.println(a.substring(0, 5));
// 8) replace AND replace ALL
		System.out.println(a.replace("evening", "nights"));
		String d=a.replace("e", "+#�$�");
		System.out.println(d);
		System.out.println(d.replaceAll("[^a-zA-Z0-9]", ""));
// 9) split  string 
		
		String [] array=a.split("e");
		System.out.println(array.length);
		

	
	}

}