package com.class5;

import java.util.Scanner;

public class LogicalScanner {
	public static void main(String[]Args) {
		// TODO Auto-generated method stub

	
	/* ask user to enter age
	 * if age is 1 to 3 say you are baby
	 * if age 3-5 say toddler
	 * if age 5-12 kid
	 * if 12-19 teena ger
	 * if age > 20 adult
	 * 
	 * ****************
	 * Daily sales 
	 * give comission to person
	 * if sales <100 comission%10
	 * if between 100 to 200 %20 
	 */
		double salesAmount;
		double comission;
		
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Please enter sales");
		salesAmount=scan.nextDouble();
		
		if (salesAmount<100) {
			comission=salesAmount*0.1;
		
		}else if (salesAmount>100 && salesAmount <200);
		comission=salesAmount*0.2;
		System.out.println("Your Comision");
		System.out.println(comission);
		

}
}