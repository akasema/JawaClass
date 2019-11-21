package com.Class7;

public class WhileLoop {
	public static void main(String[]Arg) {
		
		int time=8;
		
		if (time<12) {
			System.out.println("Good morning1");
		}
		while (time<12) {
			System.out.println("Good morning "+ time);
			time++;
		}
		System.out.println("Out of while loop");
	}

}
