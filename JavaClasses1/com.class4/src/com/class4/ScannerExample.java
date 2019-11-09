package com.class4;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		/*Scanner is a class in java that allow us to take an input from a user
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		/*nextInt();-> for numbers 
		 * next line(); Strings
		 * NextDouble();-> double
		 */
		int number=scan.nextInt();
		System.out.println("Entered number is "+ number);
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name ");
		String name=input.nextLine();
		System.out.println("Good after Noon " +name);
		
		
		
	}

}
