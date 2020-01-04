package com.Class12;

public class StringManupulation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if String1 Equals Str2 and ignore case
		String Str1 = new String("This is really not immutable!!");
		String Str2 = Str1; 
		String Str3 = new String("This is really not immutable!!");
		String Str4 = new String("This IS REALLY NOT IMMUTABLE!!");
		boolean retVal; 
		retVal = Str1.equals( Str2 );
		System.out.println("Returned Value = " + retVal ); 
		retVal = Str1.equals( Str3 );
		System.out.println("Returned Value = " + retVal );
		retVal = Str1.equalsIgnoreCase( Str4 );
		System.out.println("Returned Value = " + retVal );   // true
		
		
		//Str1 contains Str2
		String str="Good morning, students!";
		boolean contains=str.contains("students");//true
		System.out.println(contains);
		
		//There are two ways to create string objects.
		//1//LiteralString
		String  name="Jhon";
		System.out.println(name);
		System.out.println("The length of nameis= "+name.length());
		
		//2//Creating String with new key word
		String name1=new String("John1");
		System.out.println(name1);
		/* *This method returns the length of this string.  
		 * *The length is equal to the number  
		 * *of 16-bit Unicode characters in the string.  */
		int name1Len=name1.length();
		System.out.println("The lenght of name1 is= "+name1Len);
		System.out.println("=================");
		/* * toLowerCase(); 
		 * * This method converts all of the  
		 * * characters in this String to lowercase  
		 * */
		String str1="HelLo woRld";
		System.out.println("Before:: "+str1);
		str1 = str1.toLowerCase();
		System.out.println("After:: "+str1);
		System.out.println("=================");
		//.equals()//This method will count everything such
		//capitalization and content
		String str2="HElLo WoRld";
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		//.equalsIgnoreCase();
		//This method does not care for capitalization and compare the
		//content only
		System.out.println(str1.equalsIgnoreCase(str2));
		/* * toUpperCase(); 
		 * * This method converts all of the characters in  
		 * * this String to uppercase
		 */
		String str3="Mohammad";
		System.out.println("Before :: "+str3);str3=str3.toUpperCase();
		System.out.println("After:: "+str3);
		
		
	}

}
