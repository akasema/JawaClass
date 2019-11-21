package com.class5;

import java.util.Scanner;

public class HomeworkAndOr {
	public static void main(String[] args) {
		
		String word1, word2;
		int num1, num2;
		
		Scanner scan=new Scanner(System.in);
	
	System.out.println("Please enter two strings");
	word1 = scan.nextLine();
	word2 = scan.nextLine();
	
	System.out.println("Please enter two Numbers");
	num1 = scan.nextInt();
	num2 = scan.nextInt();
	
	if (word1==word2 || num1==num2) {
		System.out.println("AND");
	}else if (word1==word2 && num1==num2) {
		System.out.println("OR");
	}else {
		System.out.println("NONE");
		
	}
	
	
	}

}
