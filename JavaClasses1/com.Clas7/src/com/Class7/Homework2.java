package com.Class7;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ask user to pay for a coffee
		//you need to keep asking pay untill entered price is equal 5
		//after user paid than say "Enjoy Your coffee"
		int i=1;
		
		Scanner scan = new Scanner(System.in);
		
		//while (i>0) {//method 1
			
		//System.out.println("Please pay for coffee");
		//double pay=scan.nextDouble();
		
		//i++;
		//if (pay==5) {
		//	System.out.println("Enjoy Your Coffee");
		//	i=0;
		//}
		
		//}
		int price;
		do {//1 defa iþlem yapacaðý için condition yanlýþ oldugu sürece soruyu soracak
			System.out.println("Please enter pay for your Coffee");
			price=scan.nextInt();
		}while(price!=5);
		System.out.println("Enjoy your cofeee");
		
		int price1;
		System.out.println("Please enter pay for your Coffee");
		price1=scan.nextInt();
		
		while (price1!=5) {//no need increment as i did!
			 System.out.println("Please enter pay for your Coffee");
			 price1=scan.nextInt();
		}
		System.out.println("Enjoy your cofeee");
		}

	
	}


