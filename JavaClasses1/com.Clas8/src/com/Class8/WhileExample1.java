package com.Class8;

import java.util.Scanner;

public class WhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ask user raining or not boolean
		//as long as raining lets take umbrella
		//not raining go to par
		
		boolean isRain;
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("Is it raining");
			isRain=scan.nextBoolean();
		
		}while(isRain);
				
		System.out.println("No Rain so Go to Park");
	}

}
