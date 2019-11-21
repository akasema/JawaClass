package com.class5;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		
	}
	/*Write a program that will read tree inputs of score (quiz, mid term, fina)
	 * determine Grade based this rules
	 * if  average >=90 grade=A
	 * average score >=70 and <90 grade is B
	 * average score >=50 and <70 grade is C
	 * average score<50  grade is F
	 * 2) write a program to determine classMode.  if there is no rain -->class 
	 */

	Scanner scan;
	int quiz, midTerm, finalScore, average;
	
	scan =new Scanner(System.in);
	System.out.println("Please enter Quiz Score");
	quiz=scan.nextInt();
	
	System.out.println("Please enter Midterm Score");
	midTerm=scan.nextInt();
	
	System.out.println("Please enter Final Score");
	finalScore=scan.nextInt();
	
	average=(quiz+midTerm+finalScore)/3;
	
	if (average>=90) {
		System.out.println("A");
	}else if (averager >=70 && average<90) {
		System.out.println("B");
		
	}else if (average >=50 && average<70) {
		System.out.println("C");
		
	}else if (average <50) {
		System.out.println("D");
	}

	
}
