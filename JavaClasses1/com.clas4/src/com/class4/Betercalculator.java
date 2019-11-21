package com.class4;

import java.util.Scanner;

public class Betercalculator {
	public static void main(String[] args) {
		//println(name1.equals(name2))
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter in First number:");
		int num1=scan.nextInt();
				
		System.out.println("Enter in operator:");
		String operator=scan.next();
		
		System.out.println("Enter in Second number:");
		int num2=scan.nextInt();
		
		if(operator.equals("+")) {
			System.out.println(num1+num2);
		}else if(operator.contentEquals("-")) {
		System.out.println(num1-num2);
		 
	}else if(operator.contentEquals("*")) {
	System.out.println(num1*num2);
	
	}else if(operator.contentEquals("/")) {
		System.out.println(num1/num2);
		
	}else {
		System.out.println("Invalide Operator");
	}

	}
}

