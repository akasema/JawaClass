package com.Homework146;

import java.util.Scanner;

public class EbobBulma {
	
	public static int ebob(int a, int b) {
	int ebob=1;
	for (int i=1; i<=a && i<=b; i++) {
		if ((a%i==0) && (b%i==0)) {
			ebob=i;
		}
	}
		return ebob;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("First Number");
		int a=scan.nextInt();
		System.out.println("Second Number");
		int b=scan.nextInt();
	
		System.out.println("Greatest Comon Divider="+ebob(a,b));

	}

}
