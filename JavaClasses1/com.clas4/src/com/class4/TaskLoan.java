package com.class4;

import java.util.Scanner;

public class TaskLoan {
	public static void main(String[] args) {
		//To ask user amount of loan and if it is more than 200000 reject
			 
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter Loan Amount");
		int loan=scan.nextInt();
		if (loan>200000) {
			System.out.println("Sorry We can not lend money");
		}else {
			System.out.println("We can give a loan");
		}
		System.out.println("Please Enter The Temp");
		int temp=scan.nextInt();
		
		System.out.println("Enter city name");
		String cityName=scan.next();
		
		int convertedTemp=(temp-32)*5/9;
		
		double fahr=temp+33.8;
		System.out.println("Temperature in city " + cityName+ " Celcius degree is " +convertedTemp);
		
	}

}
