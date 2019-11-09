package com.class5;

import java.util.Scanner;

public class BooleanBig {
	 public static void main(String [] Arg){
		    
		    int a=2;
		    int b=3;
		    int c=a+b;
		    int d=4;
		    
		    boolean isBigc = false;
		   boolean isBigd = false;
		   
		   if (c>d){
		     System.out.println(isBigc); 
		     System.out.println(isBigd);
		   }else {
		  System.out.println("Not Big");
		  
		  }

		 
		     boolean isTrue = false;
		     Scanner scan=new Scanner(System.in);
		     System.out.println("Input the boolean value");
		     isTrue = scan.nextBoolean();
		     System.out.println("The value is  true/false  ");
		     
		   }
		   
		   
		 }
		  
}
}