package com.Class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ask user enter name 5 times
		//our output should be "Good afternoon(Name)"

		Scanner scan=new Scanner(System.in);
		int i=1;
		
		while(i<=5) {
					
		System.out.println("Please enter your name");		
		String name=scan.nextLine();		
		System.out.println("i="+i+"Good after noon " +name);
		i++;
		}
		
	}

}
