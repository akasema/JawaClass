package com.Class13;

public class StrReverseAndMiddleChar {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub	
	String str="Sunday";
	
	for (int i=str.length()-1; i>=0; i--) {
		System.out.print(str.charAt(i));
			}
System.out.println("===========");

	String str2="Hello my friend";
	// stringin ortas�ndaki karakteri basmak i�in 
	
	int middle=str2.length()/2;
	if (!str2.isEmpty()) {
		if (str2.length()%2!=0 && str2.length()>=3) {
			System.out.println(str2.charAt(middle));
		}
	}
	
	}

}
