package com.class4;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
//		boolean diploma=true;
//		 float gpa=3.5f;
//		
//		if (diploma) {
//			
//			System.out.println("Congragulation");
//			if (gpa>=3.5) {
//				System.out.println("You are eligible for scholarship");
//			}else {
//				System.out.println("You should have studied harder");
//			}
//		}else {
//			System.out.println("You should get degree");
//			
//		}
//		
//		 String str = "laptops out for harambe";
//		  
//		   for (int i=5; i<str.length(); i++){
//		    System.out.print(str.charAt(i));
//		   }
//		
//		    Scanner scan= new Scanner(System.in);
//		   
//		    String str=scan.nextLine();
//		    String str1;
//		    char c,c1,c2;
//		    c=str.charAt(0);
//		    c1=str.charAt(1);
//		    c2=str.charAt(2);
//	    System.out.println("The first 3 letters of "+str+" is "+c+c1+c2+".");
//		    
//		
		 Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		  String lang;
		   String language = sc.nextLine(); 
		   
		   switch(language){
		     
		     case("Java"):
		    lang="Java is a programming language";
		     break;
		     case("C"):
		     lang="C is a procedural programming language";
		     break;
		      case("C++"):
		     lang="C++ is a middle-level programming language";
		     break;
		     default:
		     lang="Doesn't match any programming language";
		   }
		  System.out.println(lang);
	}
}