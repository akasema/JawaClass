package com.class5;

import java.util.Scanner;

public class LogicalOr {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gün Sayýsýný gýrýnýz");
		int day=scan.nextInt();
		
		if (day==2 || day==4) {
			System.out.println("SDLC Class");
		}else if (day==6 || day==7) {
			System.out.println("Java Class");
		}else if (day==1 || day==5) {
			System.out.println("No class");
		}else if (day==3) {
			System.out.println("Revýew Class");
		}
		
	}

}
