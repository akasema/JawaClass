package com.Class12;

import java.util.Scanner;

public class PassWordTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner scan = new Scanner(System.in);
		        // int i=1;
		        int userl;
		        do {
		            System.out.println("Please enter your username");
		            String user = scan.nextLine();
		            userl = user.length();
		            if (user.isEmpty() || user.length() == 0) {
		                System.out.println("Username cannot be empty");
		            }
		            int userp;
		            boolean pass1;
		            
		            boolean pass2;
		            do {
		                System.out.println("Please enter your password");
		                String pass = scan.nextLine();
		                userp = pass.length();
		                pass1=pass.contains(user);
		                
		                if (pass.isEmpty() || userp == 0) {
		                    System.out.println("Password cannot be empty");
		                } else if (userp <8) {
		                    System.out.println("Password is too short");
		                }else if (pass1) {
		                    
		                    System.out.println("Password cannot contain username");
		                } else {
		                    
		                    //boolean pass2;
		                    do {
		                    System.out.println("Please confirm your password");
		                    String passCon = scan.nextLine();
		                    pass2=pass.equals(passCon);
		                    if (pass2) {
		                        System.out.println("Your username and password has been created");
		                        
		                    }else {
		                        
		                        System.out.println("Passwords do not match");
		                    }
		                    }while(!pass2);
		                }
		            } while (userp == 0||userp<8||pass1);
		        } while (userl == 0);

		
		
	}

}