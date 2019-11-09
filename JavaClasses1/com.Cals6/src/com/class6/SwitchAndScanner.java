package com.class5;

import java.util.Scanner;

public class SwitchAndScanner {
	public static void main(String[] args) {
		/* ask user F or M 
		 * F for female,  M for Male, other  Unknown
		 * yaz�lan�n ilk karakterini almak 
		 */
		// switch-case-break will work only byte, short, int, char, String
		// IT WILL NOT WORK WITH DOUBLE 2.3 G�B�
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter your gender");
		char gender=scan.next().charAt(0); // yaz�lan�n ilk karakterini al�r
		String userGender;
		
		switch(gender) {
		case 'F':
			userGender = "Female";
		break;
		case 'M':
			userGender = "Male";
			break;
		default :
			userGender = "Unknown";
		}
			System.out.println("Your gender is " + userGender);
		
	}

}
