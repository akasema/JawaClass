package com.Class14;

public class StrRecapCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// .replace
		String str="your Syntax Technologies. is your place to study";
		System.out.println(str.replace('y', 'i'));
		System.out.println(str.replaceAll("your", "my"));
		
		// .replaceAll
		// �ok iyi ��renilmesi laz�m ,
		// ^ NOT demek ^[0-9] numaralar de�il demek 
		// Primitive data means pre defined for computer 
		// NON primitive ; String, char,  user taraf�ndan defiine edilebilen
		// Conditional statement allovs to run a part of our code
		// Scanner is a class present in java util package
		
		
		//1262645
//		What is Java
//		Datatypes In Java
//		If, if else and nested if else In Java
//		Scanner Class
//		Switch Case
//		While, do while loops In Java
//		For loop In Java
//		One and two dimensional array In Java
//		String and String Manipulation in java
		//.replace
				
				System.out.println(str.replace('y', 'i'));
				
				System.out.println("**************");
				System.out.println(str.replace("your", "My"));
				
				System.out.println("**************");

				//.replaceAll
				String str2="Video provides a powerful way to help you prove your point. "
						+ "When you click Online Video, you can paste in the embed "
						+ "code for the video you want to add. ";
				System.out.println(str2.replaceAll("to(.*)", ""));
				
				System.out.println("**************");

				String str3="23423Hell3049o^&*^&*$%$";
				System.out.println(str3.replaceAll("[0-9]", ""));
				System.out.println(str3.replaceAll("[^a-zA-Z]", ""));
				
				System.out.println("**************");
				System.out.println(str2.replaceFirst(" ", ""));
				
//		
		
	}

}
