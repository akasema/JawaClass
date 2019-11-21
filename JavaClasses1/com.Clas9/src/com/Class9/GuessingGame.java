package com.Class9;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Keep a Number in Your Mind between 1-20");
//		int j=0, i=10, n;
//		
//		
//		do {
//			System.out.println("Your Number is="+i);
//			boolean b=scan.nextBoolean();
//			if (b) {
//				j=i;
//				}else {
//					
//				System.out.println("Is your number to large");
//				String ans=scan.nextLine();
//			if (ans=="yes") {
//				for (n=20; n<=i; n--) {
//					System.out.println("Your Number is="+(n-1));
//					b=scan.nextBoolean();
//					
//								}
//					}else {
//						for (n=1; n<=i; n++) {
//							System.out.println("Your Number is="+(n+1));
//				}
//					}
//				}
//						
//		}while (i!=j);
//				System.out.println("Your Number is="+i);
		Scanner scan=new Scanner(System.in);
	    int a, b;
	    b=15;
	     
	    do {  
	    	System.out.println("enter a number between 1 and 20");
	        a=scan.nextInt();
	        if(a>b) {	            
	            System.out.println("your number is too large");
	            }
	        else if (a<b){
	            System.out.println("your number is too small");
	             }
	        } while(a!=b);
	    System.out.println("you won!!!");
	        
	    }
	    
	}

