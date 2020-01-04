package com.class4;

import java.util.Scanner;

public class ScannerCalculator {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		
		System.out.println(num1+num2);
		}

}
