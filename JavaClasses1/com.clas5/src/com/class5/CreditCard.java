package com.class5;

import java.util.Scanner;

public class CreditCard {
	public static void main(String[]Args) {
	//ask user if he has credit card
	//if not offer him
	//if he has ask balance
	//if balance >1000 ask to pay
	//othervise say him spend more
	
	Scanner input=new Scanner(System.in);
	System.out.println("Do you have a credit  card ?  False or True");
	boolean cc=input.nextBoolean();
	
	if (cc) {
		System.out.println("What is your balance ");
		int balance=input.nextInt();
		
		if (balance>1000) {
			System.out.println("Please pay your balance");
			
		}else System.out.println("Continue to spend please");
		
	}else {
		System.out.println("Do you want to apply for a credit card?");
	}
	
	
	}		

}
