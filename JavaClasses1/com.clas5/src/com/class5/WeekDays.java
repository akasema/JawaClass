package com.class5;

import java.util.Scanner;

public class WeekDays {
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen g�n Say�s�n� g�r�n�z");
		int day=scan.nextInt();
		
		if (day>0 || day<6) {
			System.out.println("it is week Days");
		}else if (day>5 || day<8) {
			System.out.println("Weekend days");
		}else {
			System.out.println("invalid day");
		}

}

}
