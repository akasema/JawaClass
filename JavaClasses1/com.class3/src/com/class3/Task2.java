package com.class3;

public class Task2 {
	public static void main(String[] args) {
		/*Create ajava program and store values 
		 * of morgage rate and morgage price .
		 * program shoul check if rate is higher than 4.5   
		 * --> user will not buy house
		 * otherwise pay cash
		 */
		
		double rate=3.5;
		double price=200000;
		
		if (rate>=4.5) {
			System.out.println("I am Not Buying house");
			
		}else {
			System.out.println("I will consider buying the house");
			if (price>200000) {
				System.out.println("Iwill need a loan to buy house");
			}else {
				System.out.println("I will Pay Cash ");
			}
		}
	}

}
