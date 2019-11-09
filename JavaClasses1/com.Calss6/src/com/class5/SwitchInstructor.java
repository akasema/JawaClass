package com.class5;

import java.util.Scanner;

public class SwitchInstructor {
	public static void main(String[] args) {
		
		//First Output: "Enter name of the instructor"

	//case 1: if User provided the name as Shiva as input it should show  "Will take care of Java Assignment"
	//case 2: if User provided the name as Sandish as input it should show  "Will take care of SDLC Assignment"
	//case 3: if User Weqas as input it should show  "Will take care of Selenium Assignment"
	//case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

	//Other than these four names if user provide the name try to give like (James or John ) " Invalid instructor selected"
		
		Scanner scan=new Scanner(System.in);
		   String assignment;
		   System.out.println("Enter name of the instructor");
		   String nInstr =scan.nextLine();
		   
		   switch(nInstr){
			 case ("Shiva"):
				 assignment = "Will take care of Java Assignment";
				break;
						
				case ("Sandish"):
				 assignment = "Will take care of SDLC Assignment";
					break;
			
				case ("Weqas"):
				assignment = "Will take care of Selenium Assignment";
						break;
			
				case ("Asel"):
				assignment = "Will take care of every Assignment";
							break;
					default:
						assignment ="Invalid instructor selected";
	}
System.out.println(assignment);
}
}
