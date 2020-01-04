package com.Class14;

public class StringManumRecap {

	public static void main(String[] args) {
		
// String is a class containing string of characters
		// String is a non primitive and it is an object
		//A Java object is a combination of data and procedures
		//working on the available data.
		//The state of an OBJECT is stored in fields (variables),
		//while METHODS (functions) display the object's behavior.
		//String is IMMUTABLE (Deðiþtirilemez, baþka str ye atanabilir )
		
		String str=new String("Hello");
		String str3=new String("Hello");// memoryde 1 hello var str3 onu refere eder
		System.out.println(str==str3);// false çýkar , str ve str3 eþit deðil çünku 
		
		
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1==s2);// true gösterir çünki ayný içeriði refere ederler
		
		System.out.println(str);
		String str2=str.replaceAll("Hello", "Bye");
		System.out.println(str2);
	}

}
