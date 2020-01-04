package com.class5;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
	
		/*ask user to enter the month were born 
		 * based on month , define the season
		 * othervise unknown
		 * message"you were born -----"
		 */
		
		
		String season=null;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter month you Born");
		String month=scan.nextLine();
		
		if (month.equals("January") || month.equals("February") || month.equals("December")) {
			season="Winter";
		}else if (month.equals("April") || month.equals("May") || month.equals("March")) {
			season="Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Fall";
		}else {
			month="Unknown";
		}
		System.out.println("The Season is " +season);
		System.out.println(month);
	}
}
