package jawaRewievClasses;

import java.util.Scanner;

public class Dowhileexample {
	public static void main(String[] args) {
		 //   Task One
        //Write a program using a do while loop to print out all odd number from 0 15 
		
		
	    //   Task Two
	  //  *keep asking user to pay for candy until entered price is not equal to 3
	   //  *after user got a write amount print "Please enjoy your candy"*/  
        
//int i=0;
//do {
	//	if (i%2>0) {
//	System.out.println("i="+i);
//	i++;
//}while (i<=20);
			//}
		Scanner Scan = new Scanner(System.in);
		
		int price=0;
		do {
			System.out.println("Pay For Candy Please ");
			price=Scan.nextInt();
			
		}while (price!=3);
		System.out.println("Thank You Enjoy your Candy");
	}
}

