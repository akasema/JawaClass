package com.Class7;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create aa boolean variable workday and assign true 
		//as long as it is workDay print "i need dayoff"
		//once day is 6 print "i do not need day off"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ýs it working day ? true / false");
		boolean workDay=scan.nextBoolean();
		int day=1;
	
		while (workDay) {
						
			if (day==6 || day==7) {
				System.out.println("I dont need DayOff anymore");
				workDay=false;//sonsuz loopu onlemek için burada degiþtir
				
			}else {
			System.out.println("day="+ day + "; I need a dayOff; ");
			
			}
			day++;
			
		
	}
		day = 7;
		System.out.println("day="+ day + "; I dont need DayOff anymore-last; ");
	}
}
