package com.Class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  your Class Date :: ");
		String day=scan.nextLine();
		
	     
	        if(day.trim().toLowerCase().equals("saturday")) {
	            System.out.println("Saturday is your Java Class");
	        }else if(day.toLowerCase().equals("sunday")) {
	            System.out.println("Sunday is your Git Class");
	        }else if(day.trim().toUpperCase().equals("TUSEDAY")) {
	            System.out.println("Tuseday is your SDLC class");
	        }else if(day.trim().toLowerCase().equals("thursday")) {
	            System.out.println("Thursday is your Manual Testig class");
	        }else {
	            System.err.println("Envalid Entry!! Please enter a valid class day");
	        }
	       
	        scan.close();
	    }
	
	}
