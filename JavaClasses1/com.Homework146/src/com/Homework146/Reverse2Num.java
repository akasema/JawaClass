package com.Homework146;

import java.util.Scanner;

public class Reverse2Num {
	public final void meth(int a, int b){
	     int sum=a+b;
	      a=b;
	      b=sum-b;
	      System.out.println("a="+a+" and "+"b="+b);
	        }

	  public static void main(String[]args){
	    Scanner scan=new Scanner(System.in);
	    int a=scan.nextInt();
	    int b=scan.nextInt();
	    Main c=new Main();
	    c.meth(a,b);
	    
	  }
	    				  
 }

