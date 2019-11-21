package com.Class8;

public class BreakAndContinue {
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			if (i==5) {
				break;// simply breaks and exits the loop
			}
			System.out.println(i);
		}
		System.out.println("i am outside of loop");
		
		// continue it will skip Current iteration
		
		for (int i=1; i<=5; i++) {
			if (i==2 || i==4) {
				continue;//2 ve 4 ü  basma devam et 
			}
			System.out.println(i);
		}
		System.out.println("i am outside of loop");
		
		// i want to print nums 1 to 20 except 5,6,7
		for (int i=1; i<=20; i++) {
			if (i==5 || i==6 || i==7) {// 5 6 ve 7 yi basma devam et
				continue; 
			}
			System.out.println(i);
		}
		System.out.println("i am outside of loop");
		
	}

}
