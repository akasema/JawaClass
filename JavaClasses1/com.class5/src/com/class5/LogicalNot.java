package com.class5;

public class LogicalNot {
	public static void main(String[] args) {
		
		boolean b1=!true; // b1 is NOT true
		boolean b2=!false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=false;
		// if traffic --> late . else --> on time 
		
		if (!traffic) {  //traffic yukar�da yazan�n tersi
			System.out.println("Hello on time ");
		}else {
			System.out.println("Bye will be late");
		}
		boolean isRain=false;
		if (!isRain) {
			System.out.println("Take An Umbrella");
		}else {
			System.out.println("Dont take umbrella");
		}
		// lets compare 2 numbers us�ng NOT operator
		int num1=10;
		int num2=10;
		
		if (num1==num2) {
			System.out.println("Equals");
		}else {
			System.out.println("Not equal");
			}
		if (!(num1==num2)) {
			System.out.println("Not equal");
		}else {
			System.out.println("Equal");
		}
	}

}
