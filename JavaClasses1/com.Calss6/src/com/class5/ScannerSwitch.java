package com.class5;

import java.util.Scanner;

public class ScannerSwitch {
	public static void main(String[] args) {
		/*ask user to say country from
		 * depending on country from� define the favorite food
		 */
		String country, foodName=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("Which country are you from?");
		country=scan.nextLine();
		
		switch (country) {
		
		case "Turkey":
			foodName="kebab";
			break;		
		case "Ethiopia":
			foodName="Tibs";
			break;
		case "Morocco":
			foodName="Tajin";
			break;
		case "Kazakhistan":
			foodName="Kumis";
			break;
			
		case "Pakistan":
			foodName="Beryani";
			break;
			
		}	
		System.out.println("You are from " + country + " and Your favorite food is " + foodName);
	}

}
