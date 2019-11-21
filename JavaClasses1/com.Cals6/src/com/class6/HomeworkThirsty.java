
package com.class5;

import java.util.Scanner;

public class HomeworkThirsty {
	public static void main(String[] args) {
		//Take 2 boolean inputs from a user:
		//"Are you thirsty?"
		//"Are you sleepy?"

		//If user is thirsty and not sleepy--> drink=Water
		//If user is thirsty and sleepy--> drink=Coffee
		//If user is not thirsty and sleepy --> drink=Tea
		//Otherwise drink="Nothing"

		//Output:
		//"Looks like you need ___ "
		
		String drink = "null"; 
		boolean isThirsty;
		boolean isSleepy;
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("Are you thirsty");
		 isThirsty=scan.nextBoolean();
		 System.out.println("Are you sleepy");
		 isSleepy=scan.nextBoolean();
		 
		 if (isThirsty==true && isSleepy==false) {
			 drink="Water";
		 }else if (isThirsty && isSleepy) {
			 drink="Coffe";
		}else if (isThirsty==false && isSleepy==true) {
			drink="Tea";
			
		}else {
			drink="Nothing";
		}
		 System.out.println("Looks like you need " + drink );
	}

}
