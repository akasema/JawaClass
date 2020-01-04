package com.Homework146;

import java.util.Scanner;

public class AsalPrimeNumbers {
	
public static boolean ifPrime(int num) {
	
	for (int i=2; i<=num-1; i++) {
		if (num % i==0) {
			return false;
		}
	}
	return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Please enter a number");
int num=scan.nextInt();
for (int i=2; i<=num; i++) {
	if (ifPrime(i)) {
		System.out.println(i);
	}
}

	}

}
