package com.Class15;

import java.util.Scanner;

public class StringManupTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Let ask user enter broowser name
		// based on input say your selected browser is ....
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your browser name");
		String browser=scan.nextLine();
				
	switch(browser.toLowerCase()) {
	
	case "firefox":
		System.out.println("Execution be performed on "+browser+" browser");
		break;
	case "chrome":
		System.out.println("Execution be performed on "+browser+" browser");
		break;
	case "safari":
		System.out.println("Execution be performed on "+browser+" browser");
		break;
		
	case "IE":
		System.out.println("Execution be performed on "+browser+" browser");
		break;
		
	default:
		System.out.println("Please enter valid browser");
	}
		

	}

}
