package com.Class8;

public class IncrementExercise {
	public static void main(String[] args) {
		
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum = sum+i;
			System.out.println(sum);
		}
		System.out.println(sum);// sonuc sum=15 
		
		int sumAll=0;
		for (int i=0; i<=20; i+=5) {//      i= 0, 5, 10, 15, 20
			sumAll=sumAll+i;		// sumAll= 0, 5, 15, 30, 50
		}
		System.out.println(sumAll);//sonuc sumAll= 50
		
		int total=2;
		for (int y=1; y<=3; y++) {//    y= 1 , 2 , 3
			total=total*y;		  //total= 2 , 4 , 12
		}
		System.out.println(total);// total= 12
	}

}
