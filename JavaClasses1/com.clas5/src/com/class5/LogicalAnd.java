package com.class5;

import java.util.Scanner;

public class LogicalAnd {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		
		if (num>1 && num<10) {
			System.out.println("Number is small");
		}else if (num>=10 && num<100) {
			System.out.println("Number is medium");
				
		}else if (num>= 100 && num<1000) {
			System.out.println("Number is large");
		}else {
			System.out.println("Number is out of range");
		}
		
	}
	
}
