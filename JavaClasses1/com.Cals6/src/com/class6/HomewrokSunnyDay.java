package com.class5;

import java.util.Scanner;

public class HomewrokSunnyDay {

	  public static void main(String[]Arg){
	    boolean isSunny=false;
	    String caseW="null";
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Is it Sunny (true or false)");
	    isSunny=scan.nextBoolean();
	  
	    
	    if (isSunny){
	     caseW="It is a sunny day, I should go somewhere!";
	     System.out.println("Please enter temp degree");
		    int temp=scan.nextInt();
	     if (temp>85){
	       caseW = "I am going to the beach";
	     }else {
	       caseW="I am going to the park";
	     }
	   
	  }else{
	    caseW="I stay home and practice Java";
	  }
	  System.out.println(caseW);
	  }

	}


