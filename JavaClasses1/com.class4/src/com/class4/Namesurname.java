package com.class4;

import java.util.Scanner;

public class Namesurname {
	public static void main(String[]arg) {
		
	
	
	 System.out.println("Example:");
     Scanner scan=new Scanner(System.in);
     System.out.println("Please Enter First Name");
     
     Scanner input=new Scanner(System.in);
	String name = input.nextLine();
	System.out.println("Please Enter Surname ");
	
	String surname=input.nextLine();
	System.out.println(name+surname);
		
		
	}
}
