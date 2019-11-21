package com.class4;

import java.util.Scanner;

public class ScanneExample {
	public static void main(String[] args) {
		Scanner keyBinput = new Scanner(System.in);
		System.out.println("Are you a Male: ");
		 boolean isMale=keyBinput.nextBoolean();
		 if (isMale) {
			 System.out.println("Hey You are a male");
		 }else {
			 System.out.println("You are not a male");
		 }
	}

}
