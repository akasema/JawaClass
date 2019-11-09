package com.class5;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st numbers");
		int a=scan.nextInt();
		System.out.println("Enter 2nd numbers");
		int b=scan.nextInt();
		System.out.println("Enter 3rd numbers");
		int c=scan.nextInt();
		
		int big=0;
		
		if (a>=b && a>=c) {
			big=a;
			}else if (b>=a && b>=c) {
			big=b;
			}else if (c>=a && c>=b) {
			big=c;
		}else {
			System.out.println("There is an equality");
		}
		System.out.println("Buyuk Sayı :" +big);
	}
}
