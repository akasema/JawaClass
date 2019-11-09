package com.Class9;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting point ");
		int start=scan.nextInt();
		System.out.println("Enter ending point");
		int end=scan.nextInt();
		int i=0, j=0;
		
		//we have to check if the first number is greater than second number(Write a program)
		if (start<end) {
			i=start;
			j=end;			
		}else {
			j=start;
			i=end;
					}
		System.out.println("Start point is " +i+",End point is "+j);		
		int sumOd=0;
		int sumEven=0;
		for (int n=i; n<=j; n++) {
			if (n%2==0) {
				sumOd=sumOd+i;			
			}else {
				sumEven=sumEven+i;				
			}					
		}
		System.out.println("Sum of Even "+sumOd);
		System.out.println("Sum of odd "+ sumEven);
		
	}

}
