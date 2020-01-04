package com.class5;

import java.util.Scanner;

public class HomeworkComis {
	 public static void main(String[]Arg){
		    
		    Scanner scan=new Scanner(System.in);
		    String comis;
		    System.out.println("Please enter a number");
		    int num=scan.nextInt();
		    
		    if (num>400){
		      if (num<600){
		        comis="Don't calculate comission";
		        }else {
		        comis="Value is too large";
		          }
		    } else {
		      comis="Calculate comission";
		    }
		    System.out.println(comis);
		  }
		  
		

}
