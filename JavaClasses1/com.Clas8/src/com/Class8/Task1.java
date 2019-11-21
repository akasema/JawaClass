package com.Class8;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a code to find the sum of even and odd numbers
		//from range 1 to 20 
		// expecting 2 outputs 
		// sum for odd numbers nums=..
		// sum for even nums=..
		
	int i=1, evenNum=0, oddNum=0, sumEven=0, sumOdd=0;
	for (i=1; i<=20; i++) {
		if (i % 2 == 0 ) {
			sumEven=sumEven+i;			
		}else {
			sumOdd=sumOdd+i;			
		}
	}
	System.out.println("Sum evenNu"+sumEven);
	System.out.println("Sum oddNum"+sumOdd);
	}

}
