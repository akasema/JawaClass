package review5;

import java.util.Scanner;

public class Rewiew123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    Scanner sc = new Scanner(System.in); 
		 
		  System.out.println("Enter the browser name to proceed further with execution");
		   String browser = sc.nextLine(); 
		     String mssg=" ";
		     
		   if (browser.equalsIgnoreCase("chrome")) {
		          mssg="Proceed with Chrome browser";
		    }else if (browser.equalsIgnoreCase("firefox")){
		          mssg="Proceed with Firefox browser";
		     }else if (browser.equalsIgnoreCase("IE")) {
		          mssg="Proceed with IE browser";
		     }
		     else{
		     mssg="Invalid browser";}
		   System.out.println(mssg);
		   }
		}


