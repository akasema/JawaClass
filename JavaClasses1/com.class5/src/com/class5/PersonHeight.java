package com.class5;

import java.util.Scanner;

public class PersonHeight {
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Boy uzunlugunuzu giriniz");
		int boy=scan.nextInt();
		
		if (boy<5) {
			System.out.println(" K�sa boylusunuz");
		}else if (boy>4 || boy<7) {
			System.out.println("Orta Boylusunuz");
		}else if (boy>6) {
			System.out.println("Uzun Boylusunuz");
		}
		System.out.println("Sys out");
	}

}


