package com.Class7;

import java.util.Scanner;

public class Homeworkin6thclass {
	public static void main(String[]Arg) {
		//Task find largest of 3 numbers
		double num1=0.0, num2=0.0, num3=0.0;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		double no1= scan.nextDouble();
		double no2= scan.nextDouble();
		double no3= scan.nextDouble();
		
		if (no1 != no2 || no2 != no3) {
			
		 if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("Largest is "+ num1);
				
			}else {
				System.out.println("Largest is "+ num3);
			}
			
		}else if (num2> num3) {
			System.out.println("Largest is "+ num2);
		}
		
		}
			System.out.println("Equality");
	}
	

}
