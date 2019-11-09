package com.class3;

public class RelationalOperators {
	public static void main(String[]args ) {
		
		int num1=20;
		int num2=19;
		System.out.println(num1>num2);
		System.out.println("************");
		
		double d=1.99;
		double d1=2.99;
		boolean b=d>d1;  // b= "false"
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1); // b1 true, b2 false, b3 is true
		
		int a1=20;
		int b0=30;
		if (a1>b0) {    
			System.out.println("a larger than b");
		}
			System.out.println("b larger than a");
			int expectedHours=15;
			int actualHours=2;
			//if expected hours more than actual you will succeed, otherwise you will study more
			
		if (actualHours>expectedHours) {
			System.out.println("you will succeed");
		} else {
			System.out.println("Please study more");
		}
			
	}

}
