package com.class4;

import java.util.Scanner;

public class ScannerPractise {
	public static void main(String[] args) {
		/*Ask user to enter 2 number anc compare which is larger
		 */
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=keyboard.nextInt();
		
		System.out.println("Please enter second number");
		
		int num2=keyboard.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + "is larger than " +num2 );
		}else if (num1==num2) {
			System.out.println("Twoo numbers are equal");
		
	}else {
			System.out.println(num1+" is smaller than " +num2);
			
		}
		// keyboard.next yazd�ktan sonra her turlu variable format� geliyor oradan boolean vs bak
	}

}
