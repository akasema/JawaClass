package com.class4;

import java.util.Scanner;

public class CalculatorAdd {
	public static void main(String[] args) {
		//println(name1.equals(name2))
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter in First number:");
		int num1=scan.nextInt();
				
		System.out.println("Enter in Second number:");
		int num2=scan.nextInt();
		
		System.out.println(num1+num2);
		scan.close();
		
}
}