package com.Class8;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.print(" i="+ i);
		}
		
		//program asking user to apply cr card 10 times
		// as you get yes program stop asking 
		System.out.println(" ");
		Scanner scan= new Scanner(System.in);
			String card;		
		for (i=1; i<=10; i++) {
			System.out.println("Do you want to aplly credit card");
			card = scan.nextLine();
			
			if (card.equalsIgnoreCase("Yes")){
				break;
				
			}
		}
		System.out.println("You apply C Card");
	}

}
