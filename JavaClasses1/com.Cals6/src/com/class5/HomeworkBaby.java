package com.class5;

import java.util.Scanner;

public class HomeworkBaby {
	 public static void main(String[]Arg){
		    
		    Scanner scan=new Scanner(System.in);
		    System.out.println("enter the age of the Child");
		    int age=scan.nextInt();
		    String scenario="null";
		    switch(age){
		      case(1):
		        scenario="You can Crawl";
		        break;
		      case(2):
		        scenario="You can Talk";
		        break;
		      case(3):
		        scenario="You can Dance";
		        break;
		      case(4):
		        scenario="You can get  Trouble";
		      default:
		        scenario="I don't know how old you are";
		    }
		      System.out.println(scenario);
		    
		  }
		}


