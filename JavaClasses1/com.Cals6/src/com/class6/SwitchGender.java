package com.class5;

import java.util.Scanner;

public class SwitchGender {
	public static void main(String[]Arg){
	    Scanner scan=new Scanner(System.in);
	    System.out.println("M or F?");
	    String gender=scan.nextLine();
	    int age=scan.nextInt();
	    
	    switch(gender){
	      
	      case ("M"):
	        if (age>25){
	          System.out.println("Man");
	        }else {
	          System.out.println("Boy");
	        }
	        break;
	      case ("F"):
	        if (age>25){
	          System.out.println("Woman");
	        }else {
	          System.out.println("Girl");
	        }
	        break;
	    
	    
	  }
	  
	}
}
